import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorCessa extends UnicastRemoteObject implements ICessa{

    public ServidorCessa() throws RemoteException {
        super();
    }

    @Override
    public Factura[] FacturasPendientes(int idcliente) throws RemoteException {
        Empresa cessa = new Empresa("Cessa", 111);
        Empresa error = new Empresa("Error", 000);
        switch(idcliente){

            case 1:
                Factura[] aux = new Factura[2];
                aux[0] = new Factura(cessa, 154, Mes.Diciembre, 2021, 150 );
                aux[1]= new Factura(cessa, 326, Mes.Enero, 2022, 701);

                return aux;

            case 2:
                Factura[] aux2 = new Factura[2];
                aux2[0] = new Factura(cessa, 325, Mes.Enero, 2022, 610 );
                aux2[1]= new Factura(cessa, 427, Mes.Febrero, 2022, 801);

                return aux2;

            default:
                System.out.println("Erorr, no se encuentra el idcliente");
                Factura[] aux3 = new Factura[1];
                aux3[0] = new Factura(error, 0, Mes.Error, 0, 0 );
                return aux3;
        }

    }

    @Override
    public String Pagar(Factura[] fact) throws RemoteException {

        String res = "";

            if (fact.length == 2) {
                res = "Se pago todo con existo";
            } else {
                res = "Aun quedan facturas por pagar";
            }

        return res;
    }
}
