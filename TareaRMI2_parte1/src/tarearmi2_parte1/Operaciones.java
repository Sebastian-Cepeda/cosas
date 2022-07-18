/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarearmi2_parte1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

/**
 *
 * @author SSebas
 */
public class Operaciones extends UnicastRemoteObject implements IOperaciones {

    public Operaciones() throws RemoteException {
        super();
    }

    @Override
    public int Sumatoria(int n) throws RemoteException {
        int a = 0;

        for (int i = 1; i <= n; i++) {
            a = a + i;
        }

        return a;
    }

    @Override
    public int Factorial(int n) throws RemoteException {
        int a = 1;

        if (n == 0 || n == 1) {
            a = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                a = a * i;
            }
        }
        return a;
    }

    @Override
    public String Invertir(String ca) throws RemoteException {
        String cadenaInv = "";
        
        for (int i = ca.length() - 1; i >= 0; i--) {
           char actual = ca.charAt(i);
           cadenaInv = cadenaInv + actual;
        }
        
        return cadenaInv;
        
    }

}
