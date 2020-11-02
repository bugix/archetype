package ch.catnip.archetype;

public class App {
    public static void main(String[] args) {
        var hello = new Hello("World");
        System.out.printf("Hello %s!%n", hello.getHello());
    }
}
