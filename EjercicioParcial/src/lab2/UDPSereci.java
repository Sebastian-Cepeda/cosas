/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author LENOVO
 */
public class UDPSereci {

    /**
     * @param args the command line arguments
     */
    
    public static boolean Verificar(String ver){
        
        String[] arr = ver.split(" ");
    
        String nombre1 = arr[0];
        String nombre2 = arr[1];
        String apellido1 = arr[2];
        String apellido2 = arr[3];
        String fecha = arr[4];
        
        if (nombre1.equals("Walter") && nombre2.equals("Jhamil") && 
            apellido1.equals("Segovia") && apellido2.equals("Arellano")
                && fecha.equals("11-02-1996")){
        
            return true;
        }else{
        
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        int port = 7777;

        try {

            DatagramSocket socketUDP = new DatagramSocket(port);
            byte[] bufer = new byte[1000];

            while (true) {
                // Construimos el DatagramPacket para recibir peticiones
                DatagramPacket peticion
                        = new DatagramPacket(bufer, bufer.length);

                // Leemos una petición del DatagramSocket
                socketUDP.receive(peticion);

                String str = new String(peticion.getData());
                
                String tri = str.trim();

                boolean datos = Verificar(tri);
                String res = "";

                if(datos == false){

                    res = "Error fecha de nacimineto no correcta";

                }else{

                    res = "Verificacion Correcta";
                }




                System.out.println("Numero:" + tri);

                System.out.println("Es primo?" + datos);

                System.out.println("Es primo?" + res);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde el puerto remoto: "
                        + peticion.getPort());

                String dato = res;

                byte[] mensaje = dato.getBytes();

                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta
                        = new DatagramPacket(mensaje, dato.length(),
                        peticion.getAddress(), peticion.getPort());

                // Enviamos la respuesta, que es un eco
                socketUDP.send(respuesta);

            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
    
}
