package LearnMethods;

public class IfElseRecapMethod {

    public static void main(String[] args) {

        methodDoSomething(20);

    }


    public static boolean isTooYoung(int age) {

        boolean result = false;
        if (age < 21) {
           result = true;
        }
        return result;
    }

    public static void methodDoSomething(int age) {
        if (age > 21) {
            System.out.println("You are old enough");
            return;
        }

        System.out.println("You are too young");
    }

}

