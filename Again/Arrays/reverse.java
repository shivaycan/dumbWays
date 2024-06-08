package Again.Arrays;

public class reverse {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};

        reversen(array);

        // Print the reversed array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void reversen(int[] array) {
        // Swapping 1st and last
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Print the reversed array within the method
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(); // Add a new line after printing the reversed array
    }
}
