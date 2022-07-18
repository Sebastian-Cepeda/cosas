/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1;

/**
 *
 * @author SSebas
 */
public class Operaciones {

    
    public void Fibonaci(int n)  {

        
        int a = 0;
        int b = 1;
        int c = 0;

        if (n != 1 || n != 0) {
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;

            }
        } else {

            System.out.println("0, 1");

        }
    }

   
    public void Factorial(int n) {
        int a = 1;

        

        
            if (n == 0) {
                System.out.println("1");
            } else {
                System.out.print("Resultado: ");
                for (int i = 2; i <= n + 1; i++) {
                    System.out.print(a + ",");
                    a = a * i;

                }
            }

       
    }

    


    public void Invertir(String ca) {

        
        char[] invertir = ca.toCharArray();

        

            for (int i = ca.length() - 1; i >= 0; i--) {
                System.out.print(invertir[i]);
            }

            System.out.println("");
            System.out.println("Cadena: " + ca);
        
    }

}
