/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tarearmi2_parte1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author SSebas
 */
public interface IOperaciones extends Remote{

   public int Sumatoria(int n) throws RemoteException;
   public int Factorial(int n) throws RemoteException;
   public String Invertir(String ca) throws RemoteException;

}
