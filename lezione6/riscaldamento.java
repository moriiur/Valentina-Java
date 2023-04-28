/* Es 1 (5 minuti)
[FOR/WHILE e array]

Il parametro String[] args del metodo main è un parametro che viene inizializzato all'inizio del programma
 con ciò che viene inserito da terminale dopo "java [nomedelprogramma]".
1) scrivere un programma StampaArgs che stampi il contenuto di args, eseguire scrivendo "java StampaArgs parola1 parola2 parola3"
2) scrivere un programma Somma che sommi tutti i numeri dati per argomento (senza sapere a priori quanti argomenti) 
(esempio di esecuzione "java Somma 2 3 4" deve stampare 9)

Es 2 (10 minuti)

[Array con cicli più avanzati]
Scrivere un programma che dopo aver chiesto due parole stampi le lettere in comune.
Scrivere un programma che dati due array stampi se sono uguali o no.

Es 3 (15 minuti)
Scrivere un programma SecondoArray che chiede all'utente di inserire 10 numeri interi
e li memorizza in un array (utilizzare metodo scritto in Util). Successivamente,
in un metodo arrayPositivo() crea un nuovo array di dimensione pari al 
numero di valori maggiori o uguali a zero inseriti dall'utente e copia tutti i valori maggiori o uguali a zero nel nuovo array. 
Stampa i valori del nuovo array (usando il metodo scritto in Util).*/

public class riscaldamento{
    public static void parole() {
    String parola1 = "riscaldamento";
    String parola2 ="Riscaldamento";
    if(parola1 == parola2)
            System.out.println("Uguale");
        else
            System.out.println("Non uguale");

}
    public static void main (String [] args){
        System.out.println ();
    }


}