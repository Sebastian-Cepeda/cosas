import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RMIBanco extends UnicastRemoteObject implements IBanco{



    public RMIBanco() throws RemoteException {
        super();
    }

    @Override
    public Factura[] Calcular(int idcliente) throws RemoteException {

        ServidorCessa factcessa = new ServidorCessa();
        ServidorCotes factcotes = new ServidorCotes();

        Factura[] cotes = factcotes.FacturasPendientes(idcliente);
        Factura[] cessa = factcessa.FacturasPendientes(idcliente);



        if(idcliente == 1){

            Factura[] aux = new Factura[5];

            for(int i =0; i < 5; i++){
                if(i < 3){
                    aux[i] = cotes[i];
                }else{
                    int j = 0;
                    aux[i] = cessa[j];
                }


            }


            return aux;

        }else {

            Factura[] aux = new Factura[4];

            for(int i =0; i < 4; i++){
                if(i < 2){
                    aux[i] = cotes[i];
                }else{
                    int j = 0;
                    aux[i] = cessa[j];
                }
            }


            return aux;
        }

    }

    @Override
    public String Pagar(Factura[] fact) throws RemoteException {

        ServidorCessa factcessa = new ServidorCessa();
        ServidorCotes factcotes = new ServidorCotes();

        String rescessa = "";
        String resscotes = "";

        if(fact.length == 5){

            Factura auxcessa[] = new Factura[2];
            Factura auxcotes[] = new Factura[3];

            for(int i = 0; i < 3; i++){
                auxcotes[i] = fact[i];
            }
            for(int j = 0; j < 2; j++){
                int i = 2;
                auxcessa[j] = fact[i];
                i++;
            }

             rescessa = factcessa.Pagar(auxcessa);
             resscotes = factcotes.Pagar(auxcotes);
        }
        else{
            Factura auxcessa[] = new Factura[2];
            Factura auxcotes[] = new Factura[3];

            for(int i = 0; i < 2; i++){
                auxcotes[i] = fact[i];
            }
            for(int j = 0; j < 2; j++){
                int i = 2;
                auxcessa[j] = fact[i];
                i++;
            }
             rescessa = factcessa.Pagar(auxcessa);
             resscotes = factcotes.Pagar(auxcotes);
        }




        return rescessa+"\n "+resscotes;
    }
}
