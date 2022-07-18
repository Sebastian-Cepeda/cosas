import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorBanco {

    public static  void main(String[] args){


        try {
            RMIBanco server=new RMIBanco();

            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("Banco",server);
            System.out.println("El servidor esta levandado");


        } catch (RemoteException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
