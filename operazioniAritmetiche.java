import java.util.Scanner;

// chiedere due lati di un rettangolo e restituire il perimetro
public class operazioniAritmetiche {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Quale è la base?");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.println(base);

        System.out.println("Quale è l'altezza?");
        int altezza = Integer.parseInt(tastiera.nextLine()); // meglio usare questa sintasse per prendere tutta la linea di carratteri
        System.out.println(altezza);

        System.out.println(Math.floorMod(base, altezza));       //la formula per calcolare il resto 

        System.out.println("Il perimetro è");
        int perimetro = (base + altezza) * 2;
        System.out.println(perimetro);

        System.out.println("L'aria è");
        int area = base * altezza;
        System.out.println(area);

        System.out.println("La diagonale è");
        double diagonale = Math.sqrt(area); // Math.sqrt = la radice
        double decimale = Math.round(diagonale * 100.0) / 100.0; // la formula per arrontondare a due decimali dopo la virgola
                                                                 
        System.out.println(decimale);

    }
}
