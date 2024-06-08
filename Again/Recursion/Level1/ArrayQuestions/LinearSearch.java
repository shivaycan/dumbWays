package Again.Recursion.Level1.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearch {

    // 1. Searching a target through recursion
    // 2. Finding all indexes of a target if it is repeated
    // 3. Returning an ArrayList from a function

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int key = 4;

        // 1. Normal linear search
        int index = linearSearch(arr, key, 0);
        System.out.println("Value " + key + " found at index: " + index);

        // 2. Finding all occurrences of the target
        ArrayList<Integer> occurrences = findAllOccurrences(arr, key, 0, new ArrayList<>());
        System.out.println("Value " + key + " is at indexes: " + occurrences);

        // 3. Returning an ArrayList from a function
        ArrayList<Integer> list= new ArrayList<>(); 
        ArrayList<Integer> resultList = findArrayList(arr, key, 0,list);
        System.out.println("Value " + key + " is at indexes (using findArrayList): " + resultList);
    }

    // 1. Normal linear search
    static int linearSearch(int[] arr, int key, int i) {
        // Base case
        if (i >= arr.length) {
            return -1;
        }
        // Logic
        if (arr[i] == key) {
            return i;
        }
        // Recursive call
        return linearSearch(arr, key, i + 1);
    }

    // 2. Finding all occurrences of the target
    static ArrayList<Integer> findAllOccurrences(int[] arr, int key, int i, ArrayList<Integer> list) {
        // Base case
        if (i >= arr.length) {
            return list;
        }
        // Logic
        if (arr[i] == key) {
            list.add(i);
        }
        // Recursive call
        return findAllOccurrences(arr, key, i + 1, list);
    }

    // 3. Returning an ArrayList from a function
    static ArrayList<Integer> findArrayList(int[] arr, int key, int i, ArrayList<Integer> o) {
        // Base case
        if (i >= arr.length) {
            return o;
        }
        // Logic
        if (arr[i] == key) {
            o.add(i);
        }
        // Recursive call
          return findArrayList(arr, key, i + 1, o);
    }
}
