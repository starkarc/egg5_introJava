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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num1, num2, opcion, res;
        String exit="s";
        String choose=null;
        opcion = 0;
        res = 0;

        do {Scanner tec = new Scanner(System.in);
        System.out.println("Escriba el primer Valor");
        num1 = tec.nextInt();
        System.out.println("Escriba el segunda Valor");
        num2 = tec.nextInt();
        System.out.println("Usted introdujo los siguientes valores: " + num1 + " y " + num2);

        System.out.println("MENU");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        System.out.println("Elija Opcion");

        opcion = tec.nextInt();

        
            switch (opcion) {
                case 1:
                    res = num1 + num2;
                    System.out.println("La suma es: " + res);
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("La resta es: " + res);
                    break;
                case 3:
                    res = num1 * num2;
                    System.out.println("El producto es: " + res);
                    break;
                case 4:
                    res = num1 / num2;
                    System.out.println("La division es: " + res);
                    break;
                    
                
                default:
                    
                    System.out.println("salio");
            }
         
         
        }while (exit.equals(choose));
        }
    }


      
