package Recursion.Striver;
import java.util.ArrayList;

public class Re6Subsequences {

    //print subsequence
static void Sequence(int array[],int index,ArrayList<Integer> ssb)
{
    if(index==array.length)
     {

        System.out.println(ssb);
        return;
     }
     ssb.add(array[index]);
    Sequence(array, index+1, ssb);

    ssb.remove(ssb.size()-1);
    Sequence(array, index+1, ssb);
}
     public static void main(String[] args) {
        int array []={3,2,1};
        ArrayList<Integer> ssb=new ArrayList<Integer>(); 

        Sequence(array, 0, ssb);


        
     }
    }
    

