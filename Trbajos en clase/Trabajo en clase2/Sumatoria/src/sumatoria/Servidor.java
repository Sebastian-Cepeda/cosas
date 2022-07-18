/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author SSebas
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 5002;
        int sum;
        do {
            try {
                ServerSocket server = new ServerSocket(port);
                System.out.println("Se inicio el servidor con éxito");
                Socket client;
                PrintStream toClient;
                client = server.accept(); //conexion
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector

                System.out.println("Cliente se conecto");
                //System.out.println(fromClient.readLine());

                String respuesta = fromClient.readLine();

                int n = Integer.parseInt(respuesta);

                sum = Sumatoria(n);

                System.out.println("Sumatoria: " + sum);

                toClient = new PrintStream(client.getOutputStream());
                toClient.println("Sumatoria" + sum);
                System.out.println("Cliente se desconecto");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static int Sumatoria(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }

        return sum;
    }
}
