package Again.Sorting;

import java.util.Arrays;

public class cyclesort {

    public static void main(String[] args) {
        int [] nums={-1,1,4,3};
        cyclic(nums);
        
    }

    static void cyclic(int[] arrays){
        int i=0;
        while(i<arrays.length)
        {
            int correct=arrays[i]-1;
            
            if(arrays[i]>0 && arrays[i]!=arrays[correct])
            {
                int temp=arrays[correct];
                arrays[correct]=arrays[i];
                arrays[i]=temp; // swapped
            }
            else{ // if the ith elemnt is at the correct index elelmt is at its right place then check for i++
                i++;
            }
        }
        System.out.println(Arrays.toString(arrays));
        


    }

    
}
