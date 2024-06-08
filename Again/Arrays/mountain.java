package Again.Arrays;

public class mountain {
    public static void main(String[] args){
        int[] array={1,2,3,4,4,3,2,1};
        int ans=find(array);
        System.out.print("boom"+ans);
    }

    static int find(int[]array)
    {
        int start=0;
        int end= array.length-1;


        while(start<end)
        {
            int mid= start +(end-start)/2;
            if(array[mid]>array[mid+1]) // 3,2 The maximum value falls at the left
            {
                end= mid;
            }
            else if(array[mid]<array[mid+1]) // 2,3 falls at the right
            {
                start= mid+1;
            }
           

        }
        return end;
    }
    
}
