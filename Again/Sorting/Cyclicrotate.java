package Again;

import java.util.Arrays;

public class Cyclicrotate {
    public static void main(String[] args) {
       
    int []arr={1,2,3,4,5,6,7};
    System.out.println(Arrays.toString(cycleRoatate(arr,1)) );

    }
static int[] cycleRoatate(int[] arr,int byWhat)
{
    while(byWhat>0)
    {
 for(int i=arr.length-1;i>0;i--)
 {
    int correct=i-1;
    if(i>0 && arr[i]!=arr[correct] )
    {
        //swap
        int temp=arr[correct];
        arr[correct]=arr[i];
        arr[i]=temp;
    }
    //swap the last
 }
 byWhat--;
}
 return arr;

}
}
