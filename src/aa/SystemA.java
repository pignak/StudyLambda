package aa;

public final class SystemA {
    public static OutA out;
}

class OutA {
    public void println(Integer integer) {
        System.out.println("numero: " + integer);
    }
}

class MainClass{
    public static void main(String[] args) {
        SystemA.out.println(10);
    }
}