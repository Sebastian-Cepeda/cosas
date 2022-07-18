/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author SSebas
 */
public class ServerCurso extends UnicastRemoteObject implements ICurso {
    
    String materia;
    String docente;
    ArrayList<Estudiante> listaAlumnos;
    
    public ServerCurso() throws RemoteException {
        super();
        this.listaAlumnos = new ArrayList<Estudiante>();
    }

    @Override
    public void RegistrarEstudiantes(Estudiante estudiante) throws RemoteException {
    
        this.listaAlumnos.add(estudiante);
    }

    @Override
    public void ListarEstudiantes() throws RemoteException {
        
        System.out.println("Lista de Alumnos");
        if(!this.listaAlumnos.isEmpty()){
        
            for(int i = 0; i < this.listaAlumnos.size(); i++){
            
                System.out.println(this.listaAlumnos.get(i));
            }
        }
        else{
            System.out.println("Lista Vacia");
        }
    }

    
    
    
    
}
