package lezione4;

public class EsMetodo {
    /*public staic void nome(parametri){
    corpo}
     */
    /*public static void saluta(){
        System.out.println("Ciao");
    }*/

    /*public static int somma(int n1, int n2){
      return n1 + n2;
    }*/
      public static int max(int n1, int n2){
        if (n1 > n2)
            return n1;
        else
            return n2;

      }
    public static void main(String[] args){
     // int a = somma(1,2);
      int b = max (2,1);
        System.out.println(b);
    }
}
