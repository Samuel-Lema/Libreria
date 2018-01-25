public class ordenarArray {
   
    // Ordena un Array Simple (Descendente) - Devuelve un Array[]
    
    public static int[] ordenDesc(int[] orden) {
        
        for (int i = 0 ; i < orden.length - 1 ; i++) {
            int max = i;
 
            for (int j = i + 1 ; j < orden.length ; j++) {
                if (orden[j] > orden[max]) {
                    max = j;
                    
                }
            }
 
            if (i != max) {
                
                int aux = orden[i];
                orden[i] = orden[max];
                orden[max] = aux;
            }
        }
        
        return orden;
    }
    
    // Ordena un Array 2D (Descendente) - Devuelve un Array[][]
    
    public static int[][] ordenDesc(int[][] orden) {

        for(int f = 0; f < orden.length; f++) {

            int max = f; 
        
            for(int i = f; i < orden.length; i++) {
                
                if(sumRow(orden, i) > sumRow(orden, max)) {
                    
                    max = i;
                }
            }

            int[] aux = orden[f];
            orden[f] = orden[max];
            orden[max] = aux;
        }
        
        return orden;
    }
    
    // Funcion de ordenDesc 2D (Descendente) - Devuelve un Int
    
    public static int sumRow(int[][] orden, int row) {
        int total = 0;

        for (int c = 0; c < orden[0].length; c++) {
            total += orden[row][c];
        }

        return total;
    }
}
