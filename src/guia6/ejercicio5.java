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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Escriba un numero");
        num=tec.nextInt();
        System.out.println("Usted ingreso: "+num);
        
        System.out.println("El doble es: "+(num*2));
        System.out.println("El Triple es: "+(num*3));
        System.out.println("La raiz cuadrada es: "+(Math.sqrt(num)));
    }
    
}
