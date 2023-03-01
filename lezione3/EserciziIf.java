package lezione3;

import java.util.Scanner;

public class EserciziIf{
    /*public static void main (String[] args) {
        System.out.println("Hello World");
        /* inserisce un nome se inzia pe A scrivi 'ciao' altrimenti 'buongiorno' */
        /*Scanner tastiera= new Scanner(System.in);
        System.out.println("Inserisce il tuo nome");
        String nome = tastiera.nextLine();
        if(nome.substring(0,1).equalsIgnoreCase("A"))
            System.out.println("Ciao");
        else System.out.println("Buongiorno");*/

    public static void main(String[] args) {
         Scanner tastiera= new Scanner(System.in);
        System.out.println("Inserisci due numeri");
        int giorno = Integer.parseInt(tastieraextLine());
        int mese = Integer.parseInt(tastiera.nextLine());
        if(giorno=28 && mese ==2){
            System.out.println("è una data");
        }
            if(giorno==30 && mese== 4 || mese == 6 || mese== 9 ||mese == 11){
                System.out.println("è una data");
            }
            if (giorno <=31&& mese==1|| mese == 3 || mese == 5 || mese == 7 ||mese = 8 || mese == 10 || mese == 12)
                System.out.println("è una data");
            } else if(){
                System.out.println("non è una data");
    }
    }
}
