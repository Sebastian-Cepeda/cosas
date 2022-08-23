/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta3;

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
public class SitioComercial {

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

        IPlataforma plataforma;
        
        //Cliente
        int nrocuenta;
        String nombres;
        String primerApellido;
        String segundoApellido;
        String nrodocumento;
        //Vendedor
        int vnrocuenta;
        String vnombres;
        String vprimerApellido;
        String vsegundoApellido;
        String vnrodocumento;
        
        //CuentaBanco
        
        double saldo;
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas;
        double monto;
        boolean retener;

        try {

            plataforma = (IPlataforma) Naming.lookup("rmi://localhost/ServidorPlataformaIntercambio"); // instanciar un objeto remoto 

            //Pedida de datos para el servidor asfi
            //Datos Cliente
            System.out.println("Sitio Comercio");
            System.out.println("Introduzca sus Datos");
            System.out.println("Nombres:");
            nombres = sc.nextLine();
            System.out.println("Primer Apellido");
            primerApellido = sc.nextLine();
            System.out.println("Segundo Apellido");
            segundoApellido = sc.nextLine();
            //Datos Vendedor
            System.out.println("Introduzaca los Datos del Vendedor");;
            System.out.println("nrocunta:");
            nrocuenta = sc.nextInt();
            System.out.println("Primer Apellido");
            vprimerApellido = sc.nextLine();
            System.out.println("Segundo Apellido");
            vsegundoApellido = sc.nextLine();
            
            
            

            

        } catch (NotBoundException ex) {
            Logger.getLogger(SitioComercial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SitioComercial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SitioComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
