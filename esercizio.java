import java.util.Scanner;



public class esercizio {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
     
        System.out.println("Come ti chiami?"); 
        String nome = tastiera.nextLine();
        System.out.println(nome);

      
        System.out.println("Quanti anni hai?");
        int età = tastiera.nextInt();
        System.out.println(età);

    }
}
