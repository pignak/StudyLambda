package primari;

import java.util.function.Consumer;

public class LambdaAndMethods {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> stampaCose());
        Thread t2 = new Thread(LambdaAndMethods::stampaCose); //MethodReference === () -> stampaCose())
        t1.start();
        t2.start();
        System.out.println("----");
        aSchermo(1,System.out::println);
    }

    private static void stampaCose(){
        System.out.println("HELLO");
    }

    private static void aSchermo(int a, Consumer<Integer> consumer){
        consumer.accept(a);
    }

}
