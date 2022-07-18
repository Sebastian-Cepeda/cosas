/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

/**
 *
 * @author SSebas
 */
public class TresenRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Juego tres = new Juego();
        
        boolean win = false;
        
        tres.crearTablero();
        
        tres.MotrarTablero();
        
        do {
            //Jugador X
            tres.JuagorX();
            tres.MotrarTablero();
            boolean resultado = tres.Ganador('X');
            if(resultado == true){
                System.out.println("Juador X Gano");
                break;
            }
            //Jugador O
            tres.JugadorO();
            tres.MotrarTablero();
            resultado = tres.Ganador('O');
            if(resultado == true){
                System.out.println("Jugador O Gano");
                break;
            }
        }while(true);
    }

}
