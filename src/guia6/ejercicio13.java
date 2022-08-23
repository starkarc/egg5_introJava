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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Por favor ingrese el tamaño del cuadrado");
        int n=tec.nextInt();
        
        if(n>=0 && n<=50){
            //linea superior
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            //centro de la forma
            for (int i = 0; i < n-2; i++) {
                System.out.print("*");
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //linea inferior
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
