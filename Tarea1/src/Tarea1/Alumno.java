/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author SSebas
 */
public class Alumno {
    
    String nombres;
    String apellidos;
    String cu;
    String carrera;
    
    public Alumno(){}

    public Alumno(String nombres, String apellidos, String cu, String carrera) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cu = cu;
        this.carrera = carrera;
    }
    
    

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCU(String cu) {
        this.cu = cu;
    }

    public void setCarrerra(String carrera) {
        this.carrera = carrera;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCU() {
        return cu;
    }

    public String getCarrera() {
        return carrera;
    }
    
     @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", CU=" + cu + ", carrera=" + carrera + '}';
    }
    
    
}
