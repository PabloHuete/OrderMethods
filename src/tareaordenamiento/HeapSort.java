
package tareaordenamiento;

/**
 *
 * @author 
 */
public class HeapSort {
    private static int[] arreglo;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
 
 
   public static void buildheap(int []a) {
      n = a.length-1;
      for(int i=n/2; i>=0; i--){
         maxheap(a,i);
      }
   }
 
   public static void maxheap(int[] a, int i) { 
      left = 2*i;
      right = 2*i+1;
 
      if(left <= n && a[left] > a[i]){
         largest=left;
      } else {
         largest=i;
      }
 
      if(right <= n && a[right] > a[largest]) {
         largest=right;
      }
      if(largest!=i) {
         exchange(i, largest);
         maxheap(a, largest);
      }
   }
 
   public static void exchange(int i, int j) {
        int t = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = t; 
   }
 
   public static void sort(int[] myarray) {
      arreglo = myarray;
      buildheap(arreglo);
      for(int i=n; i>0; i--) {
         exchange(0, i);
         n=n-1;
         maxheap(arreglo, 0);
      }
   }
}
