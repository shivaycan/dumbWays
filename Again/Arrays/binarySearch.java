package Again.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int []array={1,2,4,5,3,2,1};
        int key=3;

        int ans=searchAlgo(array,key);
        System.out.println("At  "+ans);

    }
        
        static int searchAlgo(int []array,int key)
        {
            int start= 0;
            int end =array.length-1;
            while(start<=end)
            {
                int mid = start+(end - start)/2;

                if(key<array[mid])
                {
                    end = mid-1;
                }
                else if(key>array[mid])
                {
                    start=mid+1;
                }
                if(key==array[mid]){
                    return mid;
                };
            }
            return -1;
            

        } 
}
