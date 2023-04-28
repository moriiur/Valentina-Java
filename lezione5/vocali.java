import java.util.Scanner;
public class vocali {
    public static String soloVocali(String s) {
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Inserisci la stringa");
            if ("AEIOUaeiou".contains(s.substring(i, i + 1))) {
              vocali += s.substring(i, i+1);
            }
            return vocali;
        }
    }
    public static void main(String[] args) {

        System.out.println(soloVocali());
    }
}
