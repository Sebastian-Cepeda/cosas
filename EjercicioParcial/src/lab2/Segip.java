/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author LENOVO
 */
public class Segip extends UnicastRemoteObject implements ISegip {
    
    public Segip() throws RemoteException {
        super();
    }

    @Override
    public String Respuesta(int ci, String nombres, String primerApellido, String segundoApellido) throws RemoteException {
    
        boolean respuesta = false;
        String mensaje = "";
        
        if(ci == 1140506 && nombres.equals("Walter Jhamil") && primerApellido.equals("Segovia") && segundoApellido.equals("Arellano")){
        
            respuesta = true;
            mensaje = "Los Datos son correctos";
            
        }else{
        
            respuesta = false;
            mensaje = "Los Datos del CI no son correctos";
        }
    
        if(respuesta == true){
        
            return mensaje;
        }else{
        
            return mensaje;
        }
    }
    
}
