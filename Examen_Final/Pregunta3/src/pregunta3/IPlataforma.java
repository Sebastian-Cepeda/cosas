/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pregunta3;

import java.rmi.RemoteException;

/**
 *
 * @author LENOVO
 */
public interface IPlataforma {
    
    public boolean RealizarTransaccion(Cuenta cliente, Cuenta vendedor, double monto)throws RemoteException;
}
