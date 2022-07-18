import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteRMI {


    public static  void main(String[] args){

        IBanco banco;

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Introduzca IDcliente ");
        int id = sc.nextInt();

        try {

            while (!salir) {

                banco = (IBanco) Naming.lookup("rmi://localhost/Banco"); // instanciar un objeto remoto

                System.out.println("Elija la opcion");
                System.out.println("(1) Facturas Pendientes");
                System.out.println("(2) Pagar Facturas");
                System.out.println("(3) Salir");

                int op = sc.nextInt();
                switch (op) {

                    case 1:
                        System.out.println("Lista de facturas:");
                        Factura aux[] = banco.Calcular(id);
                        if(id == 1){
                            for(int i = 0; i < 5; i++){

                                System.out.println(aux[i]);
                            }

                        }else{
                            for(int i = 0; i < 4; i++){

                                System.out.println(aux[i]);
                            }

                        }

                        break;
                    case 2:
                            Factura aux2 [] = banco.Calcular(id);
                            String res = "";
                            if(id == 1){

                               res = banco.Pagar(aux2);

                            }
                            else {

                                res = banco.Pagar(aux2);
                            }

                        System.out.println(res);



                        break;
                    case 3:
                        System.out.println("Adios :D");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo opciones del 1 - 3");
                        break;

                }

            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
