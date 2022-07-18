/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoenclase5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
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
        ICurso curso;

        ArrayList<Estudiante> lista = new ArrayList();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Introduzca Nombres ");
        String nombres = sc.nextLine();
        System.out.println("Introcuzca Apellidos ");
        String apellidos = sc.nextLine();
        System.out.println("Introduza Edad");
        int edad = sc.nextInt();

        Estudiante estudiante = new Estudiante(nombres, apellidos, Sexo.Masculino, edad, Carrera.Sistemas);
        try {

            while (!salir) {

                curso = (ICurso) Naming.lookup("rmi://localhost/Curso"); // instanciar un objeto remoto 

                System.out.println("Elija la opcion");
                System.out.println("(1) Registar Estudiantes");
                System.out.println("(2) Listar Estudiantes");
                System.out.println("(3) Salir");

                int op = sc.nextInt();
                switch (op) {

                    case 1:
                        System.out.println("Registrado");
                        curso.RegistrarEstudiantes(estudiante);
                        //lista.add(estudiante);
                        break;
                    case 2:
                        curso.ListarEstudiantes();
                        
                        /*System.out.println("Lista de Alumnos");
                        if (!lista.isEmpty()) {

                            for (int i = 0; i < lista.size(); i++) {

                                System.out.println(lista.get(i));
                            }
                        } else {
                            System.out.println("Lista Vacia");
                        }*/
                        break;
                    case 3:
                        System.out.println("Adios :D");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo opciones del 1 - 3");
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
