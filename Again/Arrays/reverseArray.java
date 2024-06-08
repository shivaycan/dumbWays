package Again.Arrays;

public class reverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        reverse(array);

        // Print the reversed array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void reverse(int[] array) {
        // Swapping 1st and last
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
