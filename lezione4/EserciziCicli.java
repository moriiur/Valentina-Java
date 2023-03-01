package lezione4;

import java.util.Scanner;

public class EserciziCicli {
    public static void main(String[] args) {
        int n = 9;
        int somma = 0;
        for (int i = 1; i<=n;i = i + 2){
            somma += i;
        }
        System.out.println(somma);



      String s = "ciao";
      String inversa = "";
       for (int i = 0; i < s.length(); i++){
       inversa=inversa +s.substring(s.length()-1-i, s.length()-i);
       } System.out.println(inversa);

    }
}