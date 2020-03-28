package primari;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionLambda {

    public static void main(String[] args) {
        final int DIVISORE=0;
        int [] numeri = { 1,2,3,4 };
        System.out.println("----QUADRATO DI TUTTI GLI ELEMETNI----");
        quadrato(numeri, n -> System.out.println(n*n));
        System.out.println();
        System.out.println("----SOMMA DI TUTTI GLI ELEMENTI----");
        somma(numeri,DIVISORE, (numero,divisore) -> {
            try{
                System.out.println(numero/divisore);
            }catch (Exception e){
                System.out.println("ERRORE: " + e.getMessage());
            }
        });
    }

    public static void quadrato(int[] numeri, Consumer<Integer> consumer){
        for (int x : numeri) {
                consumer.accept(x);
        }
    }

    public static void somma(int [] numeri, int ns, BiConsumer<Integer, Integer> operazione){
        for (int x : numeri) {
            operazione.accept(x,ns);
        }
    }

}
