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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
          números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        int limite;
        int var = 0;
        int res=0;
        
        System.out.println("Escriba un valor limite");
        Scanner tec=new Scanner(System.in);
        limite=tec.nextInt();
        
        System.out.println("Valor limite asignado: "+limite);
        
        for (int i = 0; res < limite; i++) {
            System.out.println("Escribe un numero");
            var=tec.nextInt();
            
            res=var+res;
            
            System.out.println("valor acumulado: "+res);
            
        }
        
    }
        
        
        
    }
    
    
    
    

