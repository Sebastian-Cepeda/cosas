/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajoenclase4;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author SSebas
 */
public interface IOperaciones extends Remote {
   public int Sumar(int var1, int var2) throws RemoteException ; 
   public int Restar(int var1, int var2) throws RemoteException ; 
   public int Multiplicar(int var1, int var2) throws RemoteException ; 
   public int Dividir(int var1, int var2) throws RemoteException ; 
   
}
