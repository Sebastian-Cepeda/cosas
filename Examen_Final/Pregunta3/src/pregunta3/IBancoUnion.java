/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pregunta3;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IBancoUnion {
    
   public boolean Retirar(CuentaBanco cuentaBanco,double monto )throws RemoteException;
   public boolean RetenerMonto(CuentaBanco cuentaBanco, double monto) throws RemoteException;
}
