public class sample {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;


        double result = (firstValue + secondValue) * 100.00d;
        System.out.println("Result = " + result);

        double remainder = result % 40.00d;
        System.out.println("Remainder = " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}











