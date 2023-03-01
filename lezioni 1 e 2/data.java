import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);
         System.out.println("Inserisce una data");
        int giorno = Integer.parseInt(tastiera.nextLine());
        int mese = Integer.parseInt(tastiera.nextLine());
       
    if(giorno<=28 && mese==2 ) {
        System.out.println( " Data valida");
        
        }  else if(giorno<=30 && mese==4 || mese==6 || mese==9 || mese==11) {
        System.out.println(" Data valida");
        
        } else if(giorno<=31 && mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12) {
        System.out.println( " Data valida");
        
        } else
        
        System.out.println( "Data non valida");
        
        
        }
        
}
 