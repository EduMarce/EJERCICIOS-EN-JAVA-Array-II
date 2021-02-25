/*
    Ordenar de mayor a menor
*/
package arrayordenado;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ArrayORDENADO {

    public static void main(String[] args) {
        //Crear el arreglo
        int arreglo[] = new int[10];
        
        
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\tARREGLO\n");
        for(int i=0;i<arreglo.length;i++){
           System.out.print("Introduce el " + (i+1) + "° número del arreglo: ");
           arreglo[i] = sc.nextInt();
        }
        
        //Se muestra la función ordenarArray
        OrdenarArray(arreglo);
        
        //Se muestra la función mostrarArray
        mostrarArray(arreglo);
        
    }
    
    public static void OrdenarArray(int array[]){
       int variableAuxiliar;
       for(int j=0;j<(array.length-1);j++)
       for(int i=0;i<(array.length-1);i++){
           if(array[i]>array[i+1]){
             variableAuxiliar = array[i];
             array[i] = array[i+1];
             array[i+1]  = variableAuxiliar;
           }
       }
    }
    
    public static void mostrarArray(int array[]){
        System.out.println("\n----ARREGLO ORDENADO----");
      for(int i=0;i<array.length;i++){
         System.out.print(array[i] + " ");
      }
    }
    
}
