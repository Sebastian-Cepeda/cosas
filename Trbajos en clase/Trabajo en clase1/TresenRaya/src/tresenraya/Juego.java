/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

import java.util.Scanner;

/**
 *
 * @author SSebas
 */
public class Juego {

    private char[][] tablero;

    public void crearTablero() {
        tablero = new char[3][3];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '-';
            }
        }

    }

    public void MotrarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void JuagorX() {

        Scanner sin = new Scanner(System.in);
        int fila;
        int columna;

        System.out.println("Truno X");
        do {
            do {
                System.out.println("\nIntroducir fila");
                fila = sin.nextInt();
            } while (fila < 1 || fila > 3);
            fila--;

            do {
                System.out.println("\nIntroducir columna");
                columna = sin.nextInt();
            } while (columna < 1 || columna > 3);
            columna--;

        } while (tablero[fila][columna] != '-');

        tablero[fila][columna] = 'X';
    }

    public void JugadorO() {
        Scanner sin = new Scanner(System.in);
        int fila;
        int columna;

        System.out.println("Truno O");

        do {
            do {
                System.out.println("\nIntroducir fila");
                fila = sin.nextInt();
            } while (fila < 1 || fila > 3);
            fila--;

            do {
                System.out.println("\nIntroducir columna");
                columna = sin.nextInt();
            } while (columna < 1 || columna > 3);
            columna--;

        } while (tablero[fila][columna] != '-');

        tablero[fila][columna] = 'O';
    }
    
    public boolean Ganador( char jugador){
        
        //revisar filas
        if(tablero[0][0] == jugador && tablero[0][1] == jugador && tablero[0][2] == jugador){
            return true;
        }else if(tablero[1][0] == jugador && tablero[1][1] == jugador && tablero[1][2] == jugador){
            return true;
        }else if(tablero[2][0] == jugador && tablero[2][1] == jugador && tablero[2][2] == jugador){
            return true;
        }
        //revisar columnas
        else if(tablero[0][0] == jugador && tablero[1][0] == jugador && tablero[2][0] == jugador){
            return true;
        }else if(tablero[0][1] == jugador && tablero[1][1] == jugador && tablero[2][1] == jugador){
            return true;
        }else if(tablero[0][2] == jugador && tablero[1][2] == jugador && tablero[2][2] == jugador){
            return true;
        }
        //revisar diagonales
        else if(tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador){
            return true;
        }else if(tablero[2][0] == jugador && tablero[1][1] == jugador && tablero[0][2] == jugador){
            return true;
        }else{
            return false;
        }
    }
}
