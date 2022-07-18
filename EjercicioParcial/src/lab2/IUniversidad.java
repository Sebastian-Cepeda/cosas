/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author LENOVO
 */
public interface IUniversidad extends Remote{

   public Diploma EmitirDiploma(int CI, String nombres, String primerApellido, String segundoApellido, String fecha_nacimiento, Carrera carrera) throws RemoteException;
  
}
