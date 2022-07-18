/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajoenclase5;

import java.rmi.RemoteException;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author SSebas
 */
public interface ICurso extends Remote {

    public void RegistrarEstudiantes(Estudiante estudiante) throws RemoteException;
    public void ListarEstudiantes() throws RemoteException;
    
}
