package primari;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExceptionLambda {

    public static void main(String[] args) {
        final int NUMERO=0;
        int [] numeri = { 1,2,3,4 };
        System.out.println("----QUADRATO DI TUTTI GLI ELEMETNI----");
        quadrato(numeri, n -> System.out.println(n*n));
        System.out.println();
        System.out.println("----SOMMA DI TUTTI GLI ELEMENTI----");
        operazioneNumeri(numeri,NUMERO, performOperation((numero, divisore) -> System.out.println(numero/divisore)));
    }

    private static void quadrato(int[] numeri, Consumer<Integer> consumer){
        for (int x : numeri) {
                consumer.accept(x);
        }
    }

    private static void operazioneNumeri(int [] numeri, int ns, BiConsumer<Integer, Integer> operazione){
        for (int x : numeri) {
            operazione.accept(x,ns);
        }
    }

    private static BiConsumer<Integer,Integer> performOperation(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try {
                consumer.accept(a,b);
            }catch (Exception e){
            System.out.println(e.getMessage());
            }
        };
    }
}
