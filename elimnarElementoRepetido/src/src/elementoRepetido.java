/*
    Crearemos un arreglo de 10 posiciones, con datos tipo chart, algunos repetidos
    Al momento de imprimir un arreglo, no mostraremos los elementos que se repiten,
    en vez de eso, mostraremos un espacio en blaco
*/
package src;

/**
 *
 * @author eduardo
 */
public class elementoRepetido {
    public static void main(String[]args){
    
      char arreglo[] = {'1','2','1','1','3','4','5','0','0','1'};
      for(int i=0;i<arreglo.length;i++){
          for(int j=0;j<(arreglo.length-1);j++){
            if(i!=j){
              if(arreglo[i] == arreglo[j]){
                 arreglo[j] = ' ';
              }
            }
          }
      }  
      
      for(int i=0;i<arreglo.length;i++){
        System.out.println(arreglo[i]);
      }
      
    }
}
