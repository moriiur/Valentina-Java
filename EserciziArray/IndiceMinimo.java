public class IndiceMinimo   {
        public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 6};
            int indiceMinimo = trovaIndiceMinimo(array);
            System.out.println("L'indice dell'elemento minimo dell'array è: " + indiceMinimo);
        }
    
        public static int trovaIndiceMinimo(int[] array) {
            int indiceMinimo = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[indiceMinimo]) {
                    indiceMinimo = i;
                }
            }
            return indiceMinimo;
        }
    }

