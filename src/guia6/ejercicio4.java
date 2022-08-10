/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tempCelsius;
        int tempF;
        
       Scanner tec=new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
       tempCelsius=tec.nextInt();
       
       tempF=(32+(9*tempCelsius/5));
       
        System.out.println("Temperatura en Celsius: "+tempCelsius+" °");
        System.out.println("Temperatura equivalente en Farenheit: "+tempF+" °");
        
    }
    
}
