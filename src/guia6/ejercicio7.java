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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        Scanner tec=new Scanner(System.in);
        System.out.println("Escriba eureka");
        frase=tec.nextLine();
        
        if("eureka".equals(frase)){
            System.out.println("Frase Correcta");
        } else{
            System.out.println("Frase Incorrecta");
        }
        
    }
    
}
