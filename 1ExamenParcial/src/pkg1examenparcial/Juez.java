/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1examenparcial;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class Juez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        CI:11021654
        Nombres: Juan Perez
        Apellido: Segovia
        
        Banco Mercantil: [23254]
         */

        IASFI asfi;
        String nombres;
        String apellidos;
        String ci;
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas;
        double monto;
        boolean retener;

        try {

            asfi = (IASFI) Naming.lookup("rmi://localhost/ServidorASFI"); // instanciar un objeto remoto 

            //Pedida de datos para el servidor asfi
            System.out.println("Consultas de cuentas");
            System.out.println("Introduzca el CI del cliente");
            ci = sc.nextLine();
            System.out.println("Introduzca los Nombres del cliente");
            nombres = sc.nextLine();
            System.out.println("Introduzca los Apellidos del cliente");
            apellidos = sc.nextLine();

            cuentas = asfi.ConsultarCuenta(ci, nombres, apellidos);

            if (!cuentas.isEmpty()) {

                for (int i = 0; i < cuentas.size(); i++) {

                    System.out.println(cuentas.get(i));//obtencion de lista de cuentas
                }

                System.out.println("Elija el monto a retener");//Pedido de monto a retener
                monto = sc.nextDouble();
                retener = asfi.RetenerMonto(cuentas.get(0), monto, "Bs");//Respuesta del servidor asfi true o flase

                
                //comparacion de respuestas
                if (retener == true) {

                    System.out.println("Transaccion con exito");
                } else {
                    System.out.println("No se pudo realizar la retencion");
                }
            } else {

                System.out.println("No existen cuentas");
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Juez.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
