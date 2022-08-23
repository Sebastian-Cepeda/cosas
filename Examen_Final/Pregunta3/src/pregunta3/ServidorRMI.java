/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta3;

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
        try {
            // TODO code application logic here
            
            BancoUnion serverBancoUnion = new BancoUnion();
            BancoBNB serverBancoBNB = new BancoBNB();
            PlataformaIntercambio server = new PlataformaIntercambio();
            
            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("ServidorPlataformaIntercambio", server);
            System.out.println("La PLataforma de Intercambio esta levandado");
            Naming.bind("ServidorBamcoUnion", serverBancoUnion);
            System.out.println("El serviodr Banco Union esta levandado");
            Naming.bind("ServidorBancoBNB", serverBancoBNB);
            System.out.println("El servidor BancoBNB esta levandado");
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
}
