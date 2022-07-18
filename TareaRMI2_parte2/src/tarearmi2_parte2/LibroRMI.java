/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarearmi2_parte2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author SSebas
 */
public class LibroRMI extends UnicastRemoteObject implements ILibro {

    private int tope = 0;
    private Libro[] lista = new Libro[45];

    public LibroRMI() throws RemoteException {
        super();
    }

    @Override
    public String Crear(Libro libro) throws RemoteException {
        int topeant = this.tope;
        
        
        
        if (libro != null) {

            this.lista[topeant] = libro;
            this.tope++;
            return "si";

        } else {

            return "no";

        }
        
    }

    @Override
    public String Editar(Libro libro) throws RemoteException {
        int tope = this.tope;
        int id = libro.getId() - 1;

        if (id <= tope && id >= 0) {

            this.lista[id] = libro;
            return "si";

        } else {

            return "no";

        }

    }

    @Override
    public String Eliminar(int id) throws RemoteException {
        int tope = this.tope;

        if (id <= tope) {

            this.lista[id-1] = null;
            this.tope--;
            return "si";

        } else {

            return "no";

        }
    }

    @Override
    public Libro[] Mostrar() throws RemoteException {

        Libro[] libro = this.lista;
        return libro;
    }

}
