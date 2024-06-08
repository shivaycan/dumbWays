package Again.Sorting;

import java.util.Arrays;

public class countsort {
    public static void main(String[] args) {
        int[] arr={1,4,1,3,2,4,3,7};
        
        int max = Arrays.stream(arr).max().orElse(0);
        int [] count=new int[max+1];

        for(int elements: arr)
        {
            count[elements]++;
        }
        System.out.println(Arrays.toString(count));
        //print accordingly
        int index=0;

        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[index]=i; 
                index++;
                count[i]--;
            }
        }
    
        System.out.println(Arrays.toString(arr));
        
    }
}
