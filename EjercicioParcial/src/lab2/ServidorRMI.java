/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ServidorRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
             ServidorUniversidad server = new ServidorUniversidad();
             Segip server1 = new Segip();
             
             LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
             Naming.bind("ServidorUniversidad",server);
             Naming.bind("ServidorSEGIP",server1);
             System.out.println("El servidor Universidad esta levandado");
             System.out.println("El servidor Segip esta levandado");
             
             
         } catch (RemoteException ex) {
             Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
         } catch (AlreadyBoundException ex) {
             Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
         } catch (MalformedURLException ex) {
             Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
}
