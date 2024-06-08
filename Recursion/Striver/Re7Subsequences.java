package Recursion.Striver;

import java.util.ArrayList;

public class Re7Subsequences {
    static boolean Sequence(int array[],int index,int sum,ArrayList<Integer>ssb)
    {
        if(index==array.length)
        {
            if(sum==3)
            {
             System.out.println(ssb);
             return true;
            }
            else return false;
            
        }
        ssb.add(array[index]);
        sum+=array[index];
        if(Sequence(array, index+1, sum, ssb)==true) //if true that means the result is out already
        {
            return true;
        };

        ssb.remove(ssb.size() - 1);
        sum-=array[index]; 
        if(Sequence(array, index+1, sum, ssb)==true)
        {
            return true;
            /*here true indicates that the call inside the if has produced the satisfactory result hence 
            no further calling is required*/

        };

         return false;
         /*when returned false the function call will again be happen happen */


    }
    public static void main(String[] args) {
        int array[]={1,2,1};
        ArrayList<Integer>ssb=new ArrayList<Integer>();
        Sequence(array, 0, 0, ssb);
        
    }
    
}
