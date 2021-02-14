/*
  Crearemos un arreglo de 10 posciones, donde almacenaremos 10 númeors enteros,
  y posteriormente, desplzaremos cada número una posición adelante.
 */
package desplazarposicionarray;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class DesplazarposicionArray {

    public static void main(String[] args) {
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Arreglo
        int array[] = new int[10];
        int ultimo;

        //Rellenar el arreglo
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ".- Ingrese un número: ");
            array[i] = sc.nextInt();
        }

        System.out.println("\tMOSTRANDO EL ARREGLO ORIGINAL");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        ultimo = array[(array.length - 1)];
        for (int i = 8; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = ultimo;

        System.out.println("\n\tMOSTRANDO EL ARREGLO DESPLAZANDO UNA POSICIÓN");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
