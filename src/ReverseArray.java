public class ReverseArray {

    public static void reverse(int[] array) {

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {

            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;

        }


    }

    public static void main(String[] args) {

        int[] array = {2, 4, 5, 7, 8};
        reverse(array);
        System.out.print("Reverse Array" + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
