/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ClienteUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IUniversidad universidad;

        Scanner sc = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);
        boolean salir = false;
        int ci = 1;
        String nombres;
        String primerapellido;
        String segundoapellido;
        String fecha;
        Carrera carrera;
        Diploma diploma;

        try {

            while (!salir) {

                universidad = (IUniversidad) Naming.lookup("rmi://localhost/ServidorUniversidad"); // instanciar un objeto remoto 

                System.out.println("Verificacion de Diploma");

                System.out.println("Introduzca CI");
                String cis = sc.nextLine();
                System.out.println("Introduzca Nombre Completo ");
                nombres = sc.nextLine();
                System.out.println("Introcuzca 1erApellido ");
                primerapellido = sc.nextLine();
                System.out.println("Introcuzca 2doApellido ");
                segundoapellido = sc.nextLine();
                System.out.println("Introduza Fecha de Nacimiento");
                fecha = sc.nextLine();
                carrera = Carrera.Ciencias_de_la_Computacion;
                ci = Integer.parseInt(cis);

                diploma = universidad.EmitirDiploma(ci, nombres, primerapellido, segundoapellido, fecha, carrera);

                String mensaje = diploma.getMensaje();
                if (mensaje.equals("")) {
                    System.out.println("CI: " + diploma.getCI());
                    System.out.println("Nombres: " + diploma.getNombrecompleto());
                    System.out.println("1erApellido: " + diploma.getPrimerapellido());
                    System.out.println("2doApellido: " + diploma.getSegundoapellido());
                    System.out.println("Fecha de NAcimiento: " + diploma.getFehcaNacimiento());
                    System.out.println("Carrera: " + diploma.getCarrera());

                } else {
                    System.out.println(diploma.getMensaje());
                }

            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteUniversidad.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
