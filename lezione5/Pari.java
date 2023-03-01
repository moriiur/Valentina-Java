
import java.util.Scanner;
public class Pari {
    public static boolean tuttiPari(int n){
        Scanner tastiera = new Scanner(System.in);
        boolean pari = true;
        for(int i=0; i<n; i++){
            System.out.println("Inserisci i numeri");
            System.out.println("n");
            int numero = Integer.parseInt(tastiera.nextLine());
            if((numero%2)!=0){
                pari = false;
            }
        }
        return pari;
    }
    public static void main(String[] args) {
        System.out.println(tuttiPari(3));
    }
}

