package Again.Arrays;

public class orderAgnoisBS {

    public static void main(String[] args) {
        int []array={4,3,5,6,7,0,1,2};
        int key=2 ;

        int ans=orderEg(array,key);
        System.out.println("At  "+ans);

    }

    static int orderEg(int[] array,int key)
    {
        int start =0;
        int end= array.length-1;

        boolean whatOrder = array[start]<array[end];

        
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(whatOrder) // binary search for assending order 
            { 
                    if(key<array[mid]){
                    end=mid-1;
                }
                else if(key>array[mid])
                {
                    start=mid+1;
                }
                else if(key==array[mid])
                {
                    return mid;
                }
            
             }
             else{ //decreasing order
                if(key>array[mid]){
                    end=mid-1;
                }
                else if(key<array[mid])
                {
                    start= mid+1;
                }
                else if(key==array[mid])
                {
                    return mid;
                }

             }
        }
        return -1;
    }
}
