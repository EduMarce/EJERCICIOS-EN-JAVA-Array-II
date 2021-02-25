/*
    En este programa rellenaremos un arreglo de 10 posiciones, posteriormente se 
    nos dirá si ese arreglo está ordenado de forma creciente o decreciente, o si 
    está desordnado, o si todos los números so iguales
 */
package ordenarray;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class OrdenArray {

    public static void main(String[] args) {
        //Declaramos el Lector de Datos
        Scanner sc = new Scanner(System.in);

        //Declaramos el arreglo de 10 posiciones
        int array[] = new int[10];
        boolean iguales = false;
        boolean creciente = false;
        boolean decreciente = false;

        System.out.println("\tORDEN DEL ARRAY");
        System.out.println("Ingrese el array:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + (i + 1) + ".- Ingrese el número: ");
            array[i] = sc.nextInt();
        }

        //Analizamos el array, en que orden se ingresó
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] == array[i + 1]) {  // 5 - 5 - 5 - 5 - ...
                iguales = true;
            } else {
                if (array[i] < array[i + 1]) { // 1 - 2 - 3 - 4 - 5 ...
                    creciente = true;
                } else {
                    if (array[i] > array[i + 1]) { //5 - 4 - 3 - 2 - 1
                        decreciente = true;
                    }
                }

            }
        }

        System.out.println("\n------------------------------");
        System.out.println("------------------------------");

        //Mostrando el array
        System.out.println("");
        mostrarArray(array);
        System.out.println("");
        

        //Analizamos las variables booleanas
        if (iguales == true) {
            System.out.println(("\nArray presenta los mismos valores"));
        }
        if (creciente == true && decreciente == false) {
            System.out.println(("\nArray de Forma Creciente"));
        }
        if (decreciente == true && creciente == false) {
            System.out.println(("\nArray de Forma Decreciente"));
        }
        if (creciente == true && decreciente == true) {
            System.out.println(("\nArray Desordenado"));
        }
    }

    public static void mostrarArray(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (i != 0) {
                System.out.print(" - ");
            }
            System.out.print(arreglo[i] + " ");
        }
    }

}
