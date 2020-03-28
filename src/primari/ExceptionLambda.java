package primari;

import java.util.function.Consumer;

public class ExceptionLambda {

    public static void quadrato(int[] numeri, Consumer<Integer> consumer){
        for (int x : numeri) {
            consumer.accept(x);
        }
    }

    public static void main(String[] args) {
        int [] numeri = { 1,2,3,4 };
        quadrato(numeri, n -> System.out.println(n*n));
    }

}
