/*
    El programa nos pide introducir 5 números en un array, posteriormente 
    mostrarlos en orden inverso
 */
package ordeninverso_array;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class OrdenInverso_Array {

    public static void main(String[] args) {
        //Lectorde Datos
        Scanner sc = new Scanner(System.in);

        //Arreglo de 5 números
        int listaNumeros[] = new int[5];

        //Indicamos al usuario llenar el arreglo
        System.out.println("\tLISTA DE 5 NÚMEROS");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Ingrese un número: ");
            listaNumeros[i] = sc.nextInt();
        }
        //Mostramos al usuario el orden original
        System.out.println("\n\tOrden Original");
        for (int i = 0; i < listaNumeros.length; i++) {            
            if (i != 0) {
                System.out.print(" - ");
            }
            System.out.print(listaNumeros[i]);
        }
        
        //Mostramos el orden inverso con un bucle while
        int i = 4;
        System.out.println("");
        System.out.println("\n\tOrden Inverso");
        while(i>=0){
            if (i != (listaNumeros.length-1)) {
                System.out.print(" - ");
            }
            System.out.print(listaNumeros[i]);
            i--;
        }
    }

}
