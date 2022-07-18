/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarearmi2_parte2;

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
        ILibro libros;

        Scanner sc = new Scanner(System.in);
        Scanner sin = new Scanner(System.in);
        boolean salir = false;
        int id = 1;
        int tope = 0;
        String titulo;
        String editorial;
        String autor;
        String anio;
        String mensaje;

        Libro libro;
        Libro[] lista;

        try {

            while (!salir) {

                libros = (ILibro) Naming.lookup("rmi://localhost/Libro"); // instanciar un objeto remoto 

                System.out.println("-------------------------------");
                System.out.println("Elija la opcion");
                System.out.println("(1) Crear Libro");
                System.out.println("(2) Editar Libro");
                System.out.println("(3) Eliminar Libro");
                System.out.println("(4) Mostrar");
                System.out.println("(5) Salir");
                System.out.println("-------------------------------");

                int op = sin.nextInt();
                switch (op) {

                    case 1:

                        System.out.println("Introduzca Titulo ");
                        titulo = sc.nextLine();
                        System.out.println("Introcuzca Autor ");
                        autor = sc.nextLine();
                        System.out.println("Introcuzca Editorial ");
                        editorial = sc.nextLine();
                        System.out.println("Introduza Anio");
                        anio = sc.nextLine();

                        libro = new Libro(id, titulo, editorial, autor, anio);
                        mensaje = libros.Crear(libro);
                        id++;
                        tope++;
                        if (mensaje.equals("si")) {

                            System.out.println("Relizado con exito");
                        } else {
                            System.out.println("Ocurrio un error");
                        }
                        
                        break;
                    case 2:
                        
                        System.out.println("Introduzca ID ");
                        String ids = sc.nextLine();
                        System.out.println("Introduzca Titulo ");
                        titulo = sc.nextLine();
                        System.out.println("Introcuzca Autor ");
                        autor = sc.nextLine();
                        System.out.println("Introcuzca Editorial ");
                        editorial = sc.nextLine();
                        System.out.println("Introduza Anio");
                        anio = sc.nextLine();
                        int idedit = Integer.parseInt(ids);
                        libro = new Libro(idedit, titulo, editorial, autor, anio);
                        mensaje = libros.Editar(libro);
                        
                        if (mensaje.equals("si")) {

                            System.out.println("Relizado con exito");
                        } else {
                            System.out.println("Ocurrio un error");
                        }

                        break;
                    case 3:
                        System.out.println("Inserte el id del libro a eliminar");
                        int ide = sc.nextInt();
                        mensaje = libros.Eliminar(ide);
                        if (mensaje.equals("si")) {

                            System.out.println("Fue Correctamente Eliminado");
                        } else {

                            System.out.println("Ocurrio algun Error");
                        }
                        
                        break;
                    case 4:
                        if (tope != 0) {
                            lista = libros.Mostrar();
                            for (int i = 0; i < tope; i++) {
                                if(lista[i] == null){
                                     
                                }else{
                                
                                    System.out.println(lista[i]);
                                }
                                
                            }
                        } else {
                            System.out.println("No exiten datos en la lista de libros");
                        }

                        break;
                    case 5:
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
