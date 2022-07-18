/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ServidorUniversidad extends UnicastRemoteObject implements IUniversidad {

    public ServidorUniversidad() throws RemoteException {
        super();
    }

    @Override
    public Diploma EmitirDiploma(int CI, String nombres, String primerApellido, String segundoApellido, String fecha_nacimiento, Carrera carrera) throws RemoteException {

        Diploma diploma;
        ISegip segip;
        int port = 5002;
        int puerto = 7777;
        DataInputStream in;
        DataOutputStream out;

        String verificarRude = nombres + " " + primerApellido + " " + segundoApellido + " " + fecha_nacimiento;

        String verfecha = verificarRude;

        String mensajeSERECI = "";
        String mensajeSeduca = "";
        String mensajeSegip = "";

        try {

            //RMI
            segip = (ISegip) Naming.lookup("rmi://localhost/ServidorSEGIP"); // instanciar un objeto remoto 

            mensajeSegip = segip.Respuesta(CI, nombres, primerApellido, segundoApellido);

            //SocketsTCP
            Socket seduca = new Socket("localhost", port);
            in = new DataInputStream(seduca.getInputStream());
            out = new DataOutputStream(seduca.getOutputStream());

            out.writeUTF(verificarRude);

            mensajeSeduca = in.readUTF();

            seduca.close();

            //SocketsUDP
            String dato = verfecha;

            String ip = "localhost";
            DatagramSocket socketUDP = new DatagramSocket();
            byte[] mensaje = dato.getBytes();
            InetAddress hostServidor = InetAddress.getByName(ip);

            // Construimos un datagrama para enviar el mensaje al servidor
            DatagramPacket peticion
                    = new DatagramPacket(mensaje, dato.length(), hostServidor,
                            puerto);

            // Enviamos el datagrama
            socketUDP.send(peticion);

            // Construimos el DatagramPacket que contendrá la respuesta
            byte[] bufer = new byte[1000];
            DatagramPacket respuesta
                    = new DatagramPacket(bufer, bufer.length);
            socketUDP.receive(respuesta);

            String menb = new String(respuesta.getData());

            mensajeSERECI = menb.trim();

            // Cerramos el socket
            socketUDP.close();

        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ServidorUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (mensajeSegip.equals("Los Datos son correctos") && mensajeSeduca.equals("Verificado con exito") && mensajeSERECI.equals("Verificacion Correcta")) {

            String mensaje = "";
            diploma = new Diploma(CI, nombres, Carrera.Ciencias_de_la_Computacion, primerApellido, segundoApellido, fecha_nacimiento, mensaje);
            return diploma;
        } else {

            String mensajes = mensajeSegip + "\n" + mensajeSeduca + "\n" + mensajeSERECI;
            diploma = new Diploma(CI, nombres, Carrera.Ciencias_de_la_Computacion, primerApellido, segundoApellido, fecha_nacimiento, mensajes);

            return diploma;
        }
    }
}
