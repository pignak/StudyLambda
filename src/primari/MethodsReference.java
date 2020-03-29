package primari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class MethodsReference {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> stampaCose());
        Thread t2 = new Thread(MethodsReference::stampaCose); //MethodReference === () -> stampaCose())
        t1.start();
        t2.start();
        System.out.println("----");
        aSchermo(1,System.out::println);

        System.out.println("----");

        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(10);
        numeri.add(11);
        numeri.add(12);
        numeri.add(13);
        System.out.println("static method forEach");
        numeri.forEach(System.out::println);
        //numeri.forEach(PrimaClasse.st::siso); //using my static method
        System.out.println("using lambda");
        numeri.forEach(n -> System.out.println(n)); //using lambda expression
    }

    private static void stampaCose(){
        System.out.println("HELLO");
    }

    private static void aSchermo(int a, Consumer<Integer> consumer){
        consumer.accept(a);
    }

    void ss(Object o1){
        System.out.println(String.valueOf(o1));
    }
}
