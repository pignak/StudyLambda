package primari;

import interfacceFunzinoali.ICognome;

import java.util.*;
import java.util.function.Predicate;

public class principale {

    public static void main(String[] args) {
        List<Persona> persone = new ArrayList<>();
        Persona.metodoDiAggiuntaTemporaneo(persone);

        System.out.println("++++++");
        //1 stampa tutte le persone
        System.out.println("stampa elementi della lista".toUpperCase());
        stampa(persone, persona -> true);

        System.out.println("++++++");

        //2 stampa nomi con congome che inizia per 'r'
        System.out.println("stampa elemnti con congome che inizia per 'r'".toUpperCase());
        inizioConUnaLettera(persone, p -> p.getCongome().charAt(0)=='r' || p.getCongome().charAt(0)=='R');

        System.out.println("++++++");

        //3 ordinamento lista per cognome e sua stampa
        System.out.println("ordinamento lista per cognome".toUpperCase());
        Collections.sort(persone, (p1,p2) -> p1.getCongome().compareTo(p2.getCongome()));
        stampa(persone, persona -> true);
    }

    public static void stampa(List<Persona> listaPersone, ICognome ic){
        for (Persona p1 : listaPersone) {
            if(ic.controlloLettera(p1))
                System.out.println(p1.toString());
        }
    }

    public static void inizioConUnaLettera(List<Persona> persone, Predicate<Persona> controllo){
        for (Persona p : persone) {
            if(controllo.test(p))
                System.out.println(p.toString());
        }
    }

}
