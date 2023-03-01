import java.util.Scanner;
public class vocali {
    public static String soloVocali(String s) {
        Scanner tastiera = new Scanner(System.in);
        boolean vocale = true;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Inserisci la stringa");
            System.out.println("s");
            String lettere = s.substring(i, i + 1);
            String lettere = Integer.parseInt(tastiera.nextLine());
            if (s.contains("AEIOUaeiou")) {
                vocale= false;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println(soloVocali());
    }
}
