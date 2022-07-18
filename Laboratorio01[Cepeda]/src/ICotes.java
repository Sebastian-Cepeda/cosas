import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICotes extends Remote {

    public Factura[] FacturasPendientes(int idcliente) throws RemoteException;

    public String Pagar(Factura[] fact) throws RemoteException;


}
