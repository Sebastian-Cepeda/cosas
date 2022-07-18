/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase4;

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
public class ClienteOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        IOperaciones operacion;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Introduzca un numero ");
        int n = sc.nextInt();
        System.out.println("Introcuzca el otro numero: ");
        int n2 = sc.nextInt();

        try {

            while (!salir) {

                operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 

                System.out.println("Elija la opcion");
                System.out.println("(1) Sumar");
                System.out.println("(2) Restar");
                System.out.println("(3) Multiplicar");
                System.out.println("(4) Dividr");
                System.out.println("(5) Salir");

                int op = sc.nextInt();
                switch (op) {

                    case 1:
                        System.out.println("Suma: " + operacion.Sumar(n, n2));
                        break;
                    case 2:
                        System.out.println("Resta: " + operacion.Restar(n, n2));
                        break;
                    case 3:
                        System.out.println("Multiplicaion: " + operacion.Multiplicar(n, n2));
                        break;
                    case 4:
                        System.out.println("Division: " + operacion.Dividir(n, n2));
                        break;
                    case 5:
                        System.out.println("Adios :D");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros del 1 - 5");
                        break;

                }

            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
