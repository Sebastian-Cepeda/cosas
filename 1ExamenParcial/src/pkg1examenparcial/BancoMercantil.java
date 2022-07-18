/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1examenparcial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LENOVO
 */
public class BancoMercantil {

    /**
     * @param args the command line arguments
     */
    public static String VerificarCuenta(String cadena) {

        String[] aux = cadena.split(":");
     
        String comando = aux[0];
        String datos = aux[1];

        String[] aux2 = datos.split("-");

        String ci = aux2[0];
        String nombres = aux2[1];
        String apellidos = aux2[2];

        String cuenta = "23254";
        double saldo = 2000;

        if (comando.equals("Buscar") && ci.endsWith("11021654") && nombres.endsWith("Juan Perez") && apellidos.equals("Segovia")) {

            return cuenta + "-" + saldo;
        } else {

            return "No se encontro cuentas";
        }
    }
    
    public static String VerificarCongelar(String cadena){
    
        String[] aux = cadena.split(":");
     
        String comando = aux[0];
        String datos = aux[1];

        String[] aux2 = datos.split("-");

        String nrocuenta = aux2[0];
        String monto = aux2[1];
        
        if(comando.equals("Congelar") && nrocuenta.equals("23254")){
            return "Si-"+nrocuenta;
        }else{
        
            return "NO-no encontrado";
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic her
        int port = 5002;
        DataInputStream in;
        DataOutputStream out;

        try {
            
            //Falta Separcion de Comandos

            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el Servidor Banco Mercantil con éxito");
            do {
                Socket client;
                client = server.accept(); //conexion

                in = new DataInputStream(client.getInputStream());
                out = new DataOutputStream(client.getOutputStream());
                
                //Buscar Cuenta

                String datos = in.readUTF();
                
                System.out.println("Se recibio la cadena: "+ datos);

                String verificacion = VerificarCuenta(datos);
                
                System.out.println("Verificacion: "+ verificacion);

                out.writeUTF(verificacion);
                
                //Congelar Cuenta
                
                String cadena = in.readUTF();
                
                System.out.println("Se recibio cadena: "+cadena);
                
                String verificarCongerlar = VerificarCongelar(cadena);
                
                System.out.println("VerificarCongelar: "+verificarCongerlar );
                
                out.writeUTF(verificarCongerlar);
                
                client.close();

                System.out.println("Cliente Desconectado");

            } while (true);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //posible modo para la separacion de comandos
    public static String SeparacionComandos(String cadena){
    
        String[] aux = cadena.split(":");
     
        String comando = aux[0];
    
        return comando;
    }

}
