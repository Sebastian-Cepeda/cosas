/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Diploma implements Serializable {
    
    private int CI;
    private String nombrecompleto;
    private Carrera carrera;
    private String primerapellido;
    private String segundoapellido;
    private String fehcaNacimiento;
    private String mensaje;

    public Diploma(int CI, String nombrecompleto, Carrera carrera, String primerapellido, String segundoapellido, String fehcaNacimiento, String mensaje) {
        this.CI = CI;
        this.nombrecompleto = nombrecompleto;
        this.carrera = carrera;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.fehcaNacimiento = fehcaNacimiento;
        this.mensaje = mensaje;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getFehcaNacimiento() {
        return fehcaNacimiento;
    }

    public void setFehcaNacimiento(String fehcaNacimiento) {
        this.fehcaNacimiento = fehcaNacimiento;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Diploma{" + "CI=" + CI + ", nombrecompleto=" + nombrecompleto + ", carrera=" + carrera + ", primerapellido=" + primerapellido + ", segundoapellido=" + segundoapellido + ", fehcaNacimiento=" + fehcaNacimiento + '}';
    }   
}
