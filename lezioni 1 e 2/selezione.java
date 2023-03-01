import java.util.Scanner;

public class selezione {
    public static void main (String[]args){
        /*if
        if(){

        }
        //if-else
        if(){
            
        }else{

        }
    }*/



/*int a = 0;
if(a==0){
    System.out.println("OK");
}*/


Scanner tastiera = new Scanner(System.in);
     
System.out.println("Dami tre numeri"); 


int a = Integer.parseInt(tastiera.nextLine());
int b = Integer.parseInt(tastiera.nextLine());
int c = Integer.parseInt(tastiera.nextLine());
      if (a < b && b < c){
        System.out.println(a +" "+ b + " " +c);
       
      }if (a < c && c<b ){
        System.out.println(a +" "+ c +" "+ b);
        
      }if( b<a && a<c){
        System.out.println(b + " "+ a + " "+c);
        
      }if( b<c && c<a){
        System.out.println(b + " "+ c+ " "+ a);
    }if( c<a && a<b){
        System.out.println(c + " "+a + " "+b);
    }if( c<b && b<a){
        System.out.println(c + " "+b + " "+a);
         
}
}
}
