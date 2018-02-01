
package tareaordenamiento;

/**
 *
 * @author 
 */
public class OrdenamientoBurbuja {
    
    
    //Ordenamiento Descendente
        public static int[] metodoBurbujaAscendente(int [] num){
        
            int i;
            boolean cambio = true;
            int temporal;
            
            while (cambio){
                
                cambio = false;
                
                for(i=0; i<num.length-1; i++){
                    
                    if (num[i] > num[i+1]){
                        
                        temporal = num[i];
                        num[i] = num[i+1];
                        num[i+1] = temporal;
                        cambio = true;
                    }
                }
            }
            return num;    
        }
        
        //Ordenamiento Descendente
        public static int[] metodoBurbujaDescendente(int [] num){
        
            int i;
            boolean cambio = true;
            int temporal;
            
            while (cambio == true){
                
                cambio= false;
                
                for(i=0; i<num.length-1; i++){
                    
                    if (num[i] < num[i+1]){
                        
                        temporal = num[i];
                        num[i] = num[i+1];
                        num[i+1] = temporal;
                        cambio = true;
                    }
                }
            }
            return num; 
        }  
}
