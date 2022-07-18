/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1examenparcial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ASFI extends UnicastRemoteObject implements IASFI {

    public ASFI() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Cuenta> ConsultarCuenta(String ci, String nombres, String apellidos) throws RemoteException {

        String nrocuenta = "23254";
        double saldo = 2000;
        //Creacion de la lista de cuentas del cliente
        if (ci.equals("11021654") && nombres.equals("Juan Perez") && apellidos.equals("Segovia")) {
            ArrayList<Cuenta> cuentas = new ArrayList();
            Cuenta cuenta = new Cuenta(Banco.BancoMercantil, nrocuenta, ci, nombres, apellidos, saldo);

            cuentas.add(cuenta);
            
            return cuentas;
        }else{
            //Si no existen cuentas devuelve lista vacia
            ArrayList<Cuenta> cuentasn = new ArrayList();
        
            return cuentasn;
        }
    }

    @Override
    public boolean RetenerMonto(Cuenta cuenta, double monto, String glosa) throws RemoteException {

        //Datos ClienteTCP
        int port = 5002;
        DataInputStream in;
        DataOutputStream out;
        Socket seduca;
        //Datos requeridos para la ejecucion
        String buscar = "Buscar:" + cuenta.getCi() + "-" + cuenta.getNombres() + "-" + cuenta.getApellidos();
        String congelar = "Congelar:";
        String respuesta = "";
        String cuenta1;
        String saldo1;
        String[] aux2;
        String resbuscar;

        
        try {
            //conexion a Server TCP Banco Mercantil
            seduca = new Socket("localhost", port);
            in = new DataInputStream(seduca.getInputStream());
            out = new DataOutputStream(seduca.getOutputStream());
            
            //Paso cadena Buscar: 

            out.writeUTF(buscar);
            
            resbuscar = in.readUTF();
            
            System.out.println("Respues de Buscar: "+resbuscar);//respues de cadena Buscar
            
            aux2 = resbuscar.split("-");//Separacion para sacar la cuenta buscada
            
            cuenta1 = aux2[0];
            saldo1 = aux2[1];
            
            //Paso cadena Congelar: con los datos adquiridos del Servidor TCP y Cliente
            
            congelar = congelar+cuenta1+"-"+monto;
            
            out.writeUTF(congelar);
            
            System.out.println("Verificaion de congelar: "+ congelar);//Verificaion de la cadena Congelar:
            
            respuesta = in.readUTF();
            
            System.out.println("Respuesta: "+respuesta);//REspuesta de Cadena Congelar:
            
            seduca.close();

        } catch (IOException ex) {
            Logger.getLogger(ASFI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] aux = respuesta.split("-");//Separacion de la respuesta de la cadena Congelar
        
        String mensaje = aux[0];//Posibles repuestas Si/No
        
        if(mensaje.endsWith("Si")){
        
            return true;
        }else{
        
            return false;
        }

    }
}
