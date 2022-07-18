/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author SSebas
 */
public class ServidorUDP {

    /**
     * @param args the command line arguments
     */
    public static String recuperar(String cad, int tam){
        String res = "";
        for(int i = 0; i<tam;i++){
            res += cad.charAt(i);
        }
        
        return res;    
    }
    
    public static void main(String[] args) {
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

                String str2 = recuperar(str, peticion.getLength());

                int numero = Integer.parseInt(str2);
                int potencia = numero * numero * numero;
                
                

               /* switch (str2) {

                    case "1":

                        potencia = 1;
                        System.out.println("Potencia: " + potencia);

                        break;
                    case "2":

                        potencia = 2 * 2 * 2;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "3":
                        potencia = 3 * 3 * 3;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "4":
                        potencia = 4 * 4 * 4;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "5":
                        potencia = 5 * 5 * 5;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "6":
                        potencia = 6 * 6 * 6;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "7":
                        potencia = 7 * 7 * 7;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "8":
                        potencia = 8 * 8 * 8;
                        System.out.println("Potencia: " + potencia);
                        break;
                    case "9":
                        potencia = 9 * 9 * 9;
                        System.out.println("Potencia: " + potencia);
                        break;
                    default:

                        System.out.println("Solo numereos de 1 - 9");
                        break;
                }*/

                System.out.println("Numero:" + str2);
                
                System.out.println("Potencia" + potencia);

                System.out.print("Datagrama recibido del host: "
                        + peticion.getAddress());
                System.out.println(" desde el puerto remoto: "
                        + peticion.getPort());
                
                String dato = String.valueOf(potencia);

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
