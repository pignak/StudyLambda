import java.util.Arrays;
import java.util.List;

public class principale {

    public static void main(String[] args) {
        List<Persona> persone = Arrays.asList(
                new Persona("abc","def",1),
                new Persona("ghi","lmn",2),
                new Persona("opq","rst",3),
                new Persona("uvz","lettere finite",4)
                );

        //1 stampa tutte le persone (funzionale)
        IElementiLista elementi = listaPersone -> {
            for (Persona p : listaPersone) {
                System.out.println(p.toString());
            }
        };
        elementi.elementiPersone(persone);

    }

}
