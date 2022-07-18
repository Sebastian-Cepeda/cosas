import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCotes extends UnicastRemoteObject implements ICessa{

    public ServidorCotes() throws RemoteException {
        super();
    }

    @Override
    public Factura[] FacturasPendientes(int idcliente) throws RemoteException {
        Empresa cotes = new Empresa("Cotes", 125);
        Empresa error = new Empresa("Error", 0000);
        switch(idcliente){

            case 1:
                Factura[] aux = new Factura[3];
                aux[0] = new Factura(cotes, 114, Mes.Diciembre, 2021, 170 );
                aux[1]= new Factura(cotes, 321, Mes.Enero, 2022, 100);
                aux[2] = new Factura(cotes, 22454, Mes.Febrero, 2022, 150);

                return aux;

            case 2:
                Factura[] aux2 = new Factura[2];
                aux2[0] = new Factura(cotes, 225, Mes.Enero, 2022, 150 );
                aux2[1]= new Factura(cotes, 1125, Mes.Febrero, 2022, 200);

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
        Empresa cotes = new Empresa("Cotes", 125);
        String res = "";

        if(fact.length == 3){
            Factura[] aux = new Factura[3];
            aux[0] = new Factura(cotes, 114, Mes.Diciembre, 2021, 170 );
            aux[1]= new Factura(cotes, 321, Mes.Enero, 2022, 100);
            aux[2] = new Factura(cotes, 22454, Mes.Febrero, 2022, 150);

            for(int i = 0; i < 3; i++){
                if(fact[i] == aux[i]){

                    res = "Se pago todo con existo";
                }else{

                    res = "Aun quedan facturas por pagar";
                }
            }
        }else{

            Factura[] aux = new Factura[2];
            aux[0] = new Factura(cotes, 225, Mes.Enero, 2022, 150 );
            aux[1]= new Factura(cotes, 1125, Mes.Febrero, 2022, 200);

            for(int i = 0; i < 2; i++){
                if(fact[i] == aux[i]){
                    res = "Se pago todo con existo";
                }else{
                    res = "Aun quedan facturas por pagar";
                }
            }
        }
        return res;
    }
}
