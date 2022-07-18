/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tarearmi2_parte2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author SSebas
 */
public interface ILibro extends Remote{

   public String Crear(Libro libro) throws RemoteException;
   public String Editar(Libro libro) throws RemoteException;
   public String Eliminar(int id) throws RemoteException;
   public Libro[] Mostrar()throws RemoteException;

}