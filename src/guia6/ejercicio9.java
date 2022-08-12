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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
        
        String frase, letra, mayuscula;
        letra="A";
        System.out.println("Escriba una palabra o frase, donde la Palabra inicie con una A mayuscula");
        Scanner tec=new Scanner(System.in);
        frase=tec.nextLine();
        
           
       frase=frase.substring(0,1);
        
        if(letra.equals(frase))
        {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }

        
        
        
 
        
        
        
    }
    
}
