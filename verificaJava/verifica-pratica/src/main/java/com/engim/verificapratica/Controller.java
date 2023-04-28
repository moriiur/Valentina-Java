package com.engim.verificapratica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();

    @GetMapping(value="/add")
    public void aggiungi(@RequestParam(value="squadre") String Squadra){
        sorteggio.aggiungi(Squadra);
    }


    @GetMapping("/listaSquadre")
    public List<String> listaSquadre(@RequestParam(value="nazione") String n) {
        List<Squadra> squadre = sorteggio.getSquadre();
        for (Squadra squadra : squadre) {
            if (squadra.getNazione().equals(n))
                squadre.add(squadra);
        }
        return listaSquadre(n);
    }

    @GetMapping("/sorteggio")
        public List<Squadra> sorteggioSquadre(@RequestParam(value = "nazione") String nazione){
            List<Squadra> squadreSorteggiate = new ArrayList<>();
            Squadra s1= sorteggio.next();
            String naziones1= s1.getNazione();
            squadreSorteggiate.add(s1);
        for(int i = 0; i<2; i++){
            Squadra s2= sorteggio.next();
            String naziones2 = s2.getNazione();
            if ( naziones1 != naziones2){
                squadreSorteggiate.add(s2);
            }
        }
        return squadreSorteggiate;
        }

    /*    Lo stack consegnato su carta

    * ES 1: get ("/add?nome=n&nazione=m") che aggiunge al sorteggio una squadra con nome n e nazione m (utilizzare
    * la classe Sorteggio) - 15 p
    *
    * ES 2: get ("/listaSquadre?nazione=n") che restituisce la lista delle squadre di nazione n - 20 p
    *
    * ES 3: get ("/sorteggia") che restituisce 2 squadre di nazioni diverse (utilizzare la classe Sorteggio, il metodo
    * next. Consiglio: dopo aver sorteggiato la prima, continuare a sorteggiare finché la seconda
    * non è di una nazione diversa) - 20 p
    *
    * ES 4: implementare il sorteggio delle squadre di una fase finale di un torneo a eliminazione diretta.
    * Creare il metodo sorteggiaPartite che:
    * - controlla se il numero di squadre aggiunte è una potenza di 2. Se non lo è lancia una RuntimeException.
    * - Finché ci sono squadre non sorteggiate: sorteggia 2 squadre e le inserisce in un oggetto della classe Partita (da creare)
    * - restituisce la lista di Partite.
    * creare get ("/getPartite") che restituisce la lista appena creata - 30 p
    * */

}
