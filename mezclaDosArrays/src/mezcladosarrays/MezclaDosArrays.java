/*
    Crearemos dos arrays de 10 números. Posteriormenete en un tercer arreglo, guardaremos los números 
     de los doas arreglos ( a y b); en el siguiente orden:
     1°a - 1°b - 2°a - 2°b - 3°a - 3°b ....
 */
package mezcladosarrays;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class MezclaDosArrays {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Arreglos
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];

        //Pedimos datos al usuario 
        //Primer Arreglo
        System.out.println("\tUNIÓN DE ARREGLO A Y B, EN EL ARREGLO C");
        System.out.println(" >>ARREGLO A");
        for (int i = 0; i < A.length; i++) {
            System.out.print((i + 1) + ".- Digite un número: ");
            A[i] = sc.nextInt();
        }

        //Segundo Arreglo
        System.out.println("\n >>ARREGLO B");
        for (int j = 0; j < A.length; j++) {
            System.out.print((j + 1) + ".- Digite un número: ");
            B[j] = sc.nextInt();
        }

        //Unimos el tercer arreglo
        int i = 0;
        int j = 0;
        int k=0;
        while(k<C.length){
         C[k] = A[i];
         k++;
         C[k] = B[j];
         k++;
         i++;
         j++;
        }

        //Mostramos los arreglos
        System.out.println("----MOSTRANDO LOS ARREGLOS----");
        System.out.println(">>ARREGLO A<<");
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("");

        System.out.println(">>ARREGLO B<<");
        for (j = 0; j < B.length; j++) {
            System.out.print(B[j]+" ");
        }
        
        System.out.println("");

        System.out.println(">>ARREGLO C<<");
        for (k = 0; k < C.length; k++) {
            System.out.print(C[k]+" ");
        }

    }
}
