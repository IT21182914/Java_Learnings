public class TernaryOperators {

    public static void main(String[] args) {

        /*
        ? true : false;  -----> This is the ternary operator.
          It says, "If the condition before the ? is true,
          then the result is the value after the ?.
          If it's false, then the result is the value after the : "

        */

        String makeOfCar = "Volkswagen";


        // Ternary operator
        boolean isCar = makeOfCar == "Volkswagen" ? true : false;

        if (isCar) {
            System.out.println("\nThis is a Volkswagen");
        }
    }

}
