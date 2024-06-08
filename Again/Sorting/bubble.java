package Again.Sorting;

import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        boolean swapped;
        for (int turn = 0; turn < arr.length; turn++) {
            swapped = false;
            for (int upto = 0; upto <= arr.length - 2 - turn; upto++) {
                if (arr[upto] > arr[upto + 1]) {
                    // swap
                    int temp = arr[upto + 1];
                    arr[upto + 1] = arr[upto];
                    arr[upto] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // If no swaps were made in this pass, the array is already sorted
                break;
            }
        }
        return arr;
    }
}
