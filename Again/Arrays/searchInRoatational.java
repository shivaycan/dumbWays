package Again.Arrays;

public class searchInRoatational {

    public static void main(String[] args) {

        int[] arr={2,3,4,5,1};
        int target=1;
        int pivot=findPivot(arr);
        System.out.println("i am pivot "+pivot);
        if(pivot==-1)
        {
            //it is not roatated
             System.out.println(searchAlgo(arr,target,0,arr.length-1)); 

        }

        if(arr[pivot]==target)
        {
            System.out.println(pivot);
        }
        if(arr[0]>pivot)
        {
            System.out.println(searchAlgo(arr,target,0,pivot-1));
        }
        else{
            System.out.println(searchAlgo(arr, target, pivot + 1, arr.length - 1));
        }
        
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int searchAlgo(int []array,int key,int s,int e)
        {
            int start=s;
            int end=e;
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
