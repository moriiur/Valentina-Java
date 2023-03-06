public class SommaArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        int[] a3 = sommaArray(a1, a2);
        System.out.println("Il risultato della somma degli array è:");
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }

    public static int[] sommaArray(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] + a2[i];
        }
        return a3;
    }
}