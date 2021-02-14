 /*
    Rellenaremos dos arreglos, A y B, con 12 números enteros cada uno, y colocaremos
    en un tercer arreglo C esos números, pero de manera especial:
    3 números de A, 3 números de B, y así sucesivamente
*/
package mezcladosarrays.ii;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class MezclaDosArraysII {

    public static void main(String[] args) {
      //Objeto Scanner
      Scanner entrada = new Scanner(System.in);
      
      //Arreglos
      int A[] = new int[12];
      int B[] = new int[12];
      int C[] = new int[24];
      
      //Pedimos datos al usuario
      System.out.println("\tUNIÓN DE ARREGLO A Y B , EN C");
      System.out.println("|Arreglo A|");
      for(int i=0;i<A.length;i++){
       System.out.print((i+1) + ".- Digite un número: ");
       A[i] = entrada.nextInt();
      }
      
      System.out.println("\n|Arreglo B|");
      for(int k=0;k<B.length;k++){
        System.out.print((k+1) +".- Digite un número: ");
        B[k] = entrada.nextInt();
      }
      
      //Mezclamos el arreglo A y B orden: 3 de A y 3 de B...
      int i=0;
      int j=0;
      int k=0;
      while(j<C.length){
        C[j] = A[i];
        j++;
        C[j] = A[i+1];
        j++;
        C[j] = A[i+2];
        j++;
        C[j] = B[k];
        j++;
        C[j] = B[k+1];
        j++;
        C[j] = B[k+2]; 
        j++;
        i+=3;
        k+=3;
      }
       
      
      
      //Mostramos los Arreglos
      System.out.println("\n<<<ARREGLO A>>>");
      for(i=0;i<A.length;i++){
       System.out.print(A[i] + " ");
      }
      
       System.out.println("\n<<<ARREGLO B>>>");
      for(k=0;k<B.length;k++){
       System.out.print(B[k] + " ");
      }
      
       System.out.println("\n<<<ARREGLO C>>>");
      for(j=0;j<C.length;j++){
       System.out.print(C[j] + " ");
      }
    }
}
