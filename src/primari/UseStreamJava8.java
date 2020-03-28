package primari;

import java.util.*;
import java.util.stream.Collectors;

public class UseStreamJava8 {

    public static void main(String[] args) {
        List<Persona> persone = new ArrayList<>();
        Persona.metodoDiAggiuntaTemporaneo(persone);

        //stampa tutti gli elemtni della lista
        System.out.println("---PRINT TUTTE LE PERSONE---");
        persone.forEach(System.out::println);

        //prova filtraggio
        System.out.println("---PERSONE CON COGNNOME INIZIAL EPER 'r'---");
        persone.stream()
                .filter(p -> p.getCongome().charAt(0)=='r')
                .forEach(System.out::println);

        //conta person che hanno un'eta al di sopra di 30
        System.out.println("---PERSONE CON ETA AL DI SOPRA DI 30 ANNI---");
        long count = persone.stream()
                            .filter(persona -> persona.getEta() > 30)
                            .count();
        System.out.println(count);

        //stampa sol eta al di sopra di 30
        System.out.println("---SOLO ETA AL DI SOPRA DI 30 ANNI---");
        List<Integer> pers = persone.stream()
                                    .map(Persona::getEta)
                                    .filter(eta -> eta > 30)
                                    .collect(Collectors.toList());
        System.out.println(pers);

        //somma delle eta delle persone
        System.out.println("---SOMMA ETA DELLE PERSONE---");
        int somma = persone.stream()
                .mapToInt(Persona::getEta)
                .sum();
        System.out.println(somma);
    }

}
