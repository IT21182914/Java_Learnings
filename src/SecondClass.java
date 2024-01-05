import StaticKeyword.Example.Example;

public class SecondClass {

    public static void main(String[] args) {
        Example.incrementCount();
        System.out.println("Static Count from Second Class: " + Example.count);
    }
}
