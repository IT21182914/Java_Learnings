package Algorithms.BubbleSort;

public class Main {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // This(Outer Loop) ensures that the inner loop runs multiple times
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }

    }

    public static void main(String[] args) {

        int[] array = {40, 20, 70, 30, 120, 150};
        bubbleSort(array);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

    }

}
