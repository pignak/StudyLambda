package primari;

import interfacceFunzinoali.ICognome;

import java.util.*;

public class principale {

    public static void stampa(List<Persona> listaPersone, ICognome ic){
        for (Persona p1 : listaPersone) {
            if(ic.controlloLettera(p1))
                System.out.println(p1.toString());
        }
    }

    public static void main(String[] args) {
        List<Persona> persone = Arrays.asList(
                new Persona("uvz","lettere finite",4),
                new Persona("abc","def",1),
                new Persona("opq","rst",3),
                new Persona("ghi","rmn",2)
                );

        System.out.println("++++++");
        //1 stampa tutte le persone (funzionale)
        System.out.println("stampa elementi della lista");
        stampa(persone, persona -> true);

        System.out.println("++++++");

        //2 stampa nomi con congome che inizia per 'r'
        System.out.println("stampa elemnti con congome che inizia per 'r'");
        stampa(persone, persona -> persona.getCongome().charAt(0)=='r');

        System.out.println("++++++");

        //3 ordinamento lista per cognome e sua stampa
        System.out.println("ordinamento lista per cognome");
        Collections.sort(persone, (p1,p2) -> p1.getCongome().compareTo(p2.getCongome()));
        stampa(persone, persona -> true);
    }

}
