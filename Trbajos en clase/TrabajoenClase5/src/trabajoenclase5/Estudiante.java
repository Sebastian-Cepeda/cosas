/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoenclase5;

import java.io.Serializable;

/**
 *
 * @author SSebas
 */
public class Estudiante implements Serializable {
    
    private String nombres;
    private String apelldios;
    private Sexo sexo;
    private int edad;
    private Carrera carrera;

    public Estudiante(String nombres, String apelldios, Sexo sexo, int edad, Carrera carrera) {
        this.nombres = nombres;
        this.apelldios = apelldios;
        this.sexo = sexo;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApelldios() {
        return apelldios;
    }

    public void setApelldios(String apelldios) {
        this.apelldios = apelldios;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombres=" + nombres + ", apelldios=" + apelldios + ", sexo=" + sexo + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
    
    
    
}
