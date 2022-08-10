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
public class Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int val1;
        int val2;
        int res;
        
        Scanner tec=new Scanner(System.in);
        
        
        System.out.println("Ingrese dos numeros");
        System.out.println("Ingrese el primer numero");
        val1=tec.nextInt();
        System.out.println("Ingrese el segundo numero");
        val2=tec.nextInt();
        System.out.println("Sumando Valores");
        res=val1+val2;
        System.out.println("El resultado es: "+res);
    }
    
}
