import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String s = "ciao";
        s = tastiera.nextLine();
        System.out.println(s);
        int a = tastiera.nextInt();
        int b = Integer.parseInt (tastiera.nextLine());
        //esercizio: scrivere un programma che chiede il nome e l'età 
        // e stampi tutto ciò
    }
}
