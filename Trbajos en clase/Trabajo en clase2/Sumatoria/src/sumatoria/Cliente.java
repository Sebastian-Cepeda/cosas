/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author SSebas
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int port = 5002;
         Scanner sin = new Scanner(System.in);
        try {
            Socket client = new Socket("localhost", port); 
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            System.out.println("Insertar un numero para la sumatoria");
            int numero = sin.nextInt();
            
            
            toServer.println(numero);
            
            String result = fromServer.readLine();  
            System.out.println("Sumatoria: " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
