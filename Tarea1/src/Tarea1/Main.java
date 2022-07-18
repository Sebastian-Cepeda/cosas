/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea1;

import java.util.Scanner;

/**
 *
 * @author SSebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);
        boolean salir = false;
        Operaciones operaciones = new Operaciones();
        int n;
        String cadena;
        Scanner sin = new Scanner(System.in);

        while (!salir) {
            System.out.println("Menu de las opciones de la tarea");
            System.out.println("(1) Fibonacci");
            System.out.println("(2) Invertir cadena");
            System.out.println("(3) Vector de Alumnos ordenados");
            System.out.println("(4) Salir");

            int option = op.nextInt();

            switch (option) {
                case 1:

                    System.out.println("Introduzca un numero: ");
                    n = sin.nextInt();

                    System.out.println("Fibonacci: ");
                    operaciones.Fibonaci(n);
                    break;
                case 2:
                    System.out.println("Introduzca la cadena: ");
                    cadena = sin.next();

                    System.out.println("Cadena Invertida: ");
                    operaciones.Invertir(cadena);

                    break;
                case 3:

                    Alumno listaAlumnos[] = new Alumno[10];

                    String nombres[] = {"Juan", "Carlos", "Rodrigo", "Alvaro", "Alberto", "Raul"};
                    String apellidos[] = {"Perez", "Llanos", "Illanes", "Vaca", "Delgadillo", "Choque"};
                    String carreras[] = {"Ing. Sistemas", "Ing. Quimica", "Ing. Ambiental", "Ing. en ciencias de la Computacion", "Ing. Civil", "Ing. Mecanica"};

                    System.out.println("Lista de Alumnos");
                    for (int i = 0; i < 10; i++) {
                        int random = 0;
                        random = (int) (Math.random() * 5);
                        int randomcu = (int) (Math.random() * 100);

                        String nom = nombres[random];
                        String ap = apellidos[random];
                        String cu = "111-" + randomcu;
                        String ca = carreras[random];

                        listaAlumnos[i] = new Alumno(nom, ap, cu, ca);

                        System.out.println("Alumno: " + listaAlumnos[i]);

                    }
                    Alumno auxiliar = new Alumno();
                    for (int i = 0; i < 10; i++) {
                        for (int j = i + 1; j < 10; j++) {
                            if (listaAlumnos[i].getApellidos().compareTo(listaAlumnos[j].getApellidos()) > 0) {
                                auxiliar.setNombres(listaAlumnos[i].getNombres());
                                auxiliar.setApellidos(listaAlumnos[i].getApellidos());
                                auxiliar.setCU(listaAlumnos[i].getCU());

                                listaAlumnos[i].setNombres(listaAlumnos[j].getNombres());
                                listaAlumnos[i].setApellidos(listaAlumnos[j].getApellidos());
                                listaAlumnos[i].setCU(listaAlumnos[j].getCU());

                                listaAlumnos[j].setNombres(auxiliar.getNombres());
                                listaAlumnos[j].setApellidos(auxiliar.getApellidos());
                                listaAlumnos[j].setCU(auxiliar.getCU());

                            }
                        }
                    }
                    System.out.println("Lista ordenada");
                    for (Alumno a : listaAlumnos) {
                        System.out.println(a);
                    }

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

}
