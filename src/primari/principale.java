package primari;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import interfacceFunzinoali.IElementiLista;

import java.util.*;

public class principale {

    public static void main(String[] args) {
        List<Persona> persone = Arrays.asList(
                new Persona("uvz","lettere finite",4),
                new Persona("abc","def",1),
                new Persona("opq","rst",3),
                new Persona("ghi","rmn",2)
                );

        //1 stampa tutte le persone (funzionale)
        System.out.println("stampa elementi della lista");
        IElementiLista elementi = (listaPersone) -> {
            for (Persona p : listaPersone) {
                System.out.println(p.toString());
            }
        };
        elementi.operazioneLista(persone);
        System.out.println("--------");

        //2 stampa nomi con congome che inizia per 'r'
        System.out.println("stampa elemnti con congome che inizia per 'r'");
        IElementiLista personaPerCognome = (listaPersone) -> {
            for (Persona p : listaPersone) {
                if(p.getCongome().charAt(0)=='r')
                    System.out.println(p.toString());
            }
        };
        personaPerCognome.operazioneLista(persone);
        System.out.println("++++++");

        //3 ordinamento lista per cognome e sua stampa
        System.out.println("ordinamento lista per cognome");
        Collections.sort(persone, (p1,p2) -> p1.getCongome().compareTo(p2.getCongome()));
        for (Persona p : persone) {
            System.out.println(p.toString());
        }
    }

}
