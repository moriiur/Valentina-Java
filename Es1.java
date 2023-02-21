
import java.util.Scanner;

/*public class Es1 {
    public static void main (String[] args){
        
        System.out.println("inserisci tre numeri");
        Scanner tastiera = new Scanner(System.in);
        int a=Integer.parseInt(tastiera.nextLine()); 
        int b= Integer.parseInt(tastiera.nextLine()); 
        int c = Integer.parseInt(tastiera.nextLine());
        
        double media = (a+b+c)/3;
        System.out.println("La media è " + media);
    }
    
}*/

/*public class Es1 {
    public static void main(String [] args) {
        Scanner tastiera= new Scanner(System.in);

        System.out.println("Inserisci un numero da 4 cifre"); 
        int numero = Integer.parseInt(tastiera.nextLine());
        int num1 = numero/1000;
        numero = numero-num1*1000;
        int num2 = numero/100;
        numero = numero-num2*10;
        int num3 = numero/10;
        numero= numero-num3*10;
        int num4 = numero;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        
       
    }
}*/

/*public class Es1 {                                                        da rivedere
    public static void main(String [] args) {
        Scanner tastiera= new Scanner(System.in);

        System.out.println("Inserisci un numero da 4 cifre"); 
        int numero = Integer.parseInt(tastiera.nextLine());
        int num1 = numero%1000;
       int num2 = numero%100;
       int num3 = numero%10;
     int num4 = numero;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        
       
    }
}*/




//chiedi all'utente 4 cose: giorno, mese, anno e genere restituire le 5 lettere del codice fiscale


public class Es1 {
    public static void main(String [] args) {
        Scanner tastiera= new Scanner(System.in);

        System.out.println("Inserisci la temperatura in Farenheit"); 
        double F = Double.parseDouble(tastiera.nextLine());

        double C = 5*(F -32)/9;
        System.out.println("La temperatura in Celsius è " + C);

    }
}

