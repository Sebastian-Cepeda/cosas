/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LENOVO
 */
public class TCPSeduca {

    /**
     * @param args the command line arguments
     */
    public static boolean Verificar(String ver) {

        String[] arr = ver.split(" ");

        String nombre1 = arr[0];
        String nombre2 = arr[1];
        String apellido1 = arr[2];
        String apellido2 = arr[3];
        String fecha = arr[4];
        String[] arrfecha = fecha.split("-");
        String fechana = arrfecha[0] + arrfecha[1] + arrfecha[2];
        char ruden;
        char rudea1;
        char rudea2;
        String rudeno = "";
        String rudeap1 = "";
        String rudeap2 = "";
        
        for (int i = 0; i < 2; i++) {

            ruden = nombre1.charAt(i);
            rudeno = rudeno + ruden;
            rudea1 = apellido1.charAt(i);
            rudeap1 = rudeap1 + rudea1;
            rudea2 = apellido2.charAt(i);
            rudeap2 = rudeap2 + rudea2;
        }

        String rudever = rudeno + rudeap1 + rudeap2 + fechana;
        String rude = "WaSeAr11021996";

        if (rudever.equals(rude)) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic her
        int port = 5002;
        DataInputStream in;
        DataOutputStream out;

        try {

            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el Servidor SEDUCA con éxito");
            do{
                Socket client;
                client = server.accept(); //conexion

                in = new DataInputStream(client.getInputStream());
                out = new DataOutputStream(client.getOutputStream());

                String datos = in.readUTF();
                
                boolean verificacion = Verificar(datos);
                String res="";
                
                if(verificacion == true){
                    
                    res = "Verificado con exito";
                }else{
                
                    res = "No se eocntro el titulo de bachiller";
                }
                
                out.writeUTF(res);
                
                client.close();
                
                System.out.println("Cliente Desconectado");

            }while (true); 

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
