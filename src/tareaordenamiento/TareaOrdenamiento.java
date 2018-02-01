package tareaordenamiento;

import java.util.Random;

/**
 *
 * @author
 */
public class TareaOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Random numerosAleatorios = new Random();
        int[] miLista = new int[30000];
        
        //Lleno el arreglo con 30 mil números aleatorios desde 1
        for (int i=0; i<miLista.length; i++){
            miLista[i] = numerosAleatorios.nextInt(miLista.length)+1;
        }
        
        //******************************************
        //Ordenamiento Burbuja
        //******************************************
        
        int [] burbuja = OrdenamientoBurbuja.metodoBurbujaAscendente(miLista);
        
        for (int i=0; i<miLista.length; i++){
            System.out.println(burbuja[i]);
        }
        
        
        //******************************************
        //Ordenamiento MergeSort
        //******************************************
        /*
        MergeSort merge = new MergeSort();
        merge.sort(miLista);
        merge.imprimir();
        */
        
        //******************************************
        //Ordenamiento HeapSort
        //******************************************
        /*
        HeapSort.sort(miLista);
        for (int i=0; i<miLista.length; i++){
            System.out.println(miLista[i]);
        }
        */
        
        //******************************************
        //Ordenamiento QuickSort
        //******************************************
        /*
        QuickSort quickSort = new QuickSort();
        quickSort.sort(miLista);
        
        for(int i:miLista){
            System.out.println(i);
        }
        */
        
    }  
}
