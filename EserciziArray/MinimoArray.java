public class MinimoArray {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 1, 6};
        int minimo = Minimo(array);
        System.out.println("Il valore minimo dell'array è: " + minimo);
    }

    public static int Minimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
}