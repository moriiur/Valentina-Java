import java.util.Scanner;

/*public class bool {
public static void main (String[] args){

    //!  not
    // and &&
    // or ||
    boolean a = true;
    boolean b = false;
    //== è l'uguaglianza 
    // != diverso

}
    
}*/


/*public class bool {
    public static void main (String[] args){
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int pari = Integer.parseInt(tastiera.nextLine());
        System.out.println(pari % 2 == 0 );

  }

}
*/

/*public class bool {
    public static void main (String[] args){
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int positivo = Integer.parseInt(tastiera.nextLine());
        System.out.println(positivo > 0 );

         tastiera.close();                  // per chiudere il programa di scanner
  }

}
*/
/*public class bool {
    public static void main (String[] args){
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int numero = Integer.parseInt(tastiera.nextLine());
        //System.out.println(numero <=10 && numero >=0 );
       // System.out.println( numero%2 == 0 || numero < 5);
        //System.out.println(numero > 1000 && numero%10==3);
        System.out.println(!(numero%100 == 0) && numero%4==0 || numero%400==0);
// un anno è bisestile se è divisibile per 4 ma non per 100 lo è comunque divisibile per 400
         tastiera.close();                  // per chiudere il programa di scanner
  }

}*/
public class bool {
    public static void main (String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci i numeri");
        int numero = Integer.parseInt(tastiera.nextLine());
        int n1 =1, n2= 2, n3=4;
     boolean triangolo = n1+n2<=n3 || 
       

        tastiera.close(); 
    }
}

    
