package Again.Recursion;

import java.util.Arrays;

public class reverseusingrecursion {

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(nums, 0)));
    }
    static int[] reverse(int []arr,int i){
        int n=arr.length;

        if(i>=n/2)
        {
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        //swaped
        
        reverse(arr, i+1);

        return arr;
    }
    
}
