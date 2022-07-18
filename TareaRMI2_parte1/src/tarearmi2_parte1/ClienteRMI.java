/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearmi2_parte1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SSebas
 */
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IOperaciones operaciones;

        Scanner sc = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);
        boolean salir = false;
        int n;
        int sumatoria;
        int factorial;
        String cadena;
        String invertida;

        try {

            while (!salir) {

                operaciones = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 

                System.out.println("-------------------------------");
                System.out.println("Elija la opcion");
                System.out.println("(1) Sumatoria");
                System.out.println("(2) Factorial");
                System.out.println("(3) Invertir Cadena");
                System.out.println("(4) Salir");
                System.out.println("-------------------------------");

                int op = sin.nextInt();
                switch (op) {

                    case 1:
                        System.out.println("Valor n de la Suimatoria");
                        n = sin.nextInt();

                        sumatoria = operaciones.Sumatoria(n);
                        System.out.println("La Sumatoria de " + n + " es: " + sumatoria);
                        break;
                    case 2:
                        System.out.println("Valor n del Factorial");
                        n = sin.nextInt();

                        factorial = operaciones.Factorial(n);
                        System.out.println("El factoail de " + n + " es: " + factorial);

                        break;
                    case 3:
                        System.out.println("Escriba la cadena a ser invertida");
                        cadena = sc.nextLine();
                        
                        invertida = operaciones.Invertir(cadena);
                        System.out.println("Cadena Invertida: "+invertida);
                        break;
                    case 4:
                        System.out.println("Adios :D");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo opciones del 1 - 4");
                        break;

                }

            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
