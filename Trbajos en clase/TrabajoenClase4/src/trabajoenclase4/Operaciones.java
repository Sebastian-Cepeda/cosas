/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author SSebas
 */
public class Operaciones extends UnicastRemoteObject implements IOperaciones{
   
   
    public Operaciones() throws RemoteException {
        super();
    }

    @Override
    public int Sumar(int var1, int var2) throws RemoteException {
    
        return var1 + var2;
    }

    @Override
    public int Restar(int var1, int var2) throws RemoteException {
    
        return var1 - var2;
    }

    @Override
    public int Multiplicar(int var1, int var2) throws RemoteException {
    
        return var1 * var2;
    }

    @Override
    public int Dividir(int var1, int var2) throws RemoteException {
    
        return var1 / var2;
    }
    
}
