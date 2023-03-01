import java.util.Scanner;


public class nome {
    
    public static void main (String[] args) {
        System.out.println("Hello World");
        /* inserisce un nome se inzia pe A scrivi 'ciao' altrimenti 'buongiorno' */
        Scanner tastiera= new Scanner(System.in);
        System.out.println("Inserisce il tuo nome");
        String nome = tastiera.nextLine();
        if(nome.substring(0,1).equalsIgnoreCase("A"))
            System.out.println("Ciao");
        else System.out.println("Buongiorno");
}
}