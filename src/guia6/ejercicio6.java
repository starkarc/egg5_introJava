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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Escribir un numero para determinar par o impar");
        
        num=tec.nextInt();
        
        if(num%2==0){
            System.out.println("es par");
        }else{
            System.out.println("es Impar");
        }
    }
    
}
