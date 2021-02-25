/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;


/**
 *
 * @author eduardo
 */
public class Decimal_a_Binario {
    public static void main(String[]args){
       //Lector de Datos
       Scanner sc = new Scanner(System.in);
       
       //Declaramos las variables a utilizar
       int binario[] = new int[8];
       int contador = 0;
       int numero;
       
       System.out.println("\tDECIMAL A BINARIO\n");
       System.out.print("Introduce un número: ");
       numero = sc.nextInt();
       
       if(numero<0 || 255<numero){
        System.out.println("\nEl número se encuentra fuera del rango (0 al 255");
       }
       else{
          contador = 0;
          if(numero==0){
           binario[contador] = 0;
           contador++;
          }
       }
       
       System.out.println("El número " + numero + " en binario es: ");
       
       //Realizamos el proceso de decimal a binario
       while(numero!=0){ //mientras que el número es distinto de 0
        binario[contador] = numero%2; //en el arreglo va ir almacenando los residuos de la división entre 2
        numero/=2; //luego de sacar el residuo, el número es dividido entre 2
        contador++;
       }
       
       //Mostramos el arreglo
       
       for(int i=(contador-1);i>=0;i--){
        System.out.print(binario[i] + " ");
       }  
    }
}
