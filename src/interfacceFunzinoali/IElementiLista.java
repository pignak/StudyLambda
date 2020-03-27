package interfacceFunzinoali;

import primari.Persona;
import java.util.List;

@FunctionalInterface
public interface IElementiLista {
    public void operazioneLista(List<Persona> persone);
}
