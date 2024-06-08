package Recursion.Striver;

import java.util.ArrayList;

public class Re10SubsetSum {
    static void SubsetSum(int index,int sum,int array[],ArrayList<Integer>ssb){
        if(index==array.length)
    {
            ssb.add(sum);
            return;
    }
        SubsetSum(index+1,sum+array[index], array, ssb); //pick next

        SubsetSum(index+1, sum, array, ssb); // not pick at all

    }

    static void print(int index)
    {
          SubsetSum(index,sum, array, ssb);
    }



    public static void main(String[] args) {
        int sum=0;
        int index=0;
        int array[]={3,2,1};
        ArrayList<Integer>ssb=new ArrayList<Integer>();

        SubsetSum(index,sum, array, ssb);
        

       
    }
    
}
