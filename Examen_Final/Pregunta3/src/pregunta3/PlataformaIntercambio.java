/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author LENOVO
 */
public class PlataformaIntercambio extends UnicastRemoteObject implements IPlataforma {

    public PlataformaIntercambio() throws RemoteException {
        super();
    }

    @Override
    public boolean RealizarTransaccion(Cuenta cliente, Cuenta vendedor, double monto) throws RemoteException {
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
}
