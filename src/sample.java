public class sample {

    public static void main(String[] args) {

        double doubleValue = 20.00d;
        double doubleValue2 = 80.00d;

        double result = (doubleValue + doubleValue2) * 100.00d;
        System.out.println("Result = " + result);

        double remainder = result % 40.00d;
        System.out.println("Remainder = " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

    }
}
