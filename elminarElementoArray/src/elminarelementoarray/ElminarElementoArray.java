/*
    Primero llenaremos el arreglo de 10 posiciones posteriormente el programa 
    nos pedirá la posición del número que queremos borrar. Al final se mostraá
    en pantalla el arreglo, pero ya sin el número que se borró.
 */
package elminarelementoarray;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ElminarElementoArray {
    
    public static void main(String[] args) {
        //Lector de Datos
        Scanner sc = new Scanner(System.in);

        //Indicamos que es un arreglo de 10 posiciones
        int array[] = new int[10];
        int posicionEliminar;
        
        System.out.println("\t---ARRAY---");
        System.out.println("/--LLENANDO EL ARRAY--/\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Posición (" + i + "): ");
            array[i] = sc.nextInt();
        }
        System.out.println("\n=====Array Original=====");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" - ");
            }
            System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");
        
        do {
            System.out.print("\nDigite la posición a eliminar: ");
            posicionEliminar = sc.nextInt();
            if(posicionEliminar<0 || posicionEliminar>=10){
                System.out.println("Error... Posición Inválida");
            }
        } while (posicionEliminar < 0 || posicionEliminar >= 10);
        
        
        for (int i = (posicionEliminar); i < (array.length-1); i++) { //eliminamos el valor 
            array[i] = array[i + 1]; // 8 - 9 - 7 - 72 // elimino el 9    :  8 - 7 - 72 
        }

        //Mostramos el array hasta la útlima posición
        System.out.println("\n=====Array Modificado======");
        for(int i=0;i<(array.length-1);i++){
          if(i!=0){
           System.out.print(" - ");
          }
          System.out.print(array[i]  + " ");
        }
    }
    
}
