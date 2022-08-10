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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        Scanner tec=new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra de hasta 8 caracteres");
        frase=tec.nextLine();
        
        if(frase.length()<=8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}
