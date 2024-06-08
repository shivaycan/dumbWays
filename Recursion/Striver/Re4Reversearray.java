package Recursion.Striver;

//reverse of an array and Pallindrome
public class Re4Reversearray {
    static void reverseArray(int[] array, int i) {
        int n = array.length;
        if (i >= n / 2) {
            return;
        } else {
            // Swap elements at positions i and n - i - 1
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;

            // Recursive call to reverse the remaining part of the array
            reverseArray(array, i + 1);
        }
    }

    static boolean pallindrome(int[] arr,int i)
    {
        int n=arr.length;
        if(i>n/2)
        return true;
        else{
            if(arr[i]!=arr[n-i-1])
            {
                return false;
              
            }
              return pallindrome(arr, i+1);


        }
    }

    public static void main(String[] args) {
        int array[] = {1,2,2,1};
        int i = 0;

       // reverseArray(array, i);
       System.out.println(pallindrome(array, i));


        // // Print the reversed array
        // for (int k = 0; k < array.length; k++) {
        //     System.out.print(array[k] + " ");
        // }
    }
}


