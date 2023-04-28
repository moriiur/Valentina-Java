
import java.util.Scanner;
public class Pari {
    public static boolean tuttiPari(int n){
        Scanner tastiera = new Scanner(System.in);
        boolean pari = true;
        for(int i=0; i<n; i++){
            System.out.println("Inserisci i numeri");
            int numero = Integer.parseInt(tastiera.nextLine());
            /*if((numero%2)!=0){
                pari = false;
            }*/
            pari=pari && numero%2 ==0;  //un altro modo di di controllo del pari o dispari
        }
        return pari;
    }
    public static void main(String[] args) {
        System.out.println(tuttiPari(3));
    }
}

