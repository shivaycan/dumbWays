package Again.Recursion.Level1.ArrayQuestions;

public class binarysearch {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int s=0;
        int e=arr.length-1;
        int key=6;
        int index=bs(arr,s,e,key);
        System.out.println("Value "+key+" is at index: " +index);
    }

    static int bs(int[] arr,int s,int e,int key)
    {
        //basecase
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==key)
        {
            return mid;
        }

        if(arr[mid]>key) 
        {
            return bs(arr,s,mid-1,key);
        }
        else 
        {
            return bs(arr,mid+1,e,key);
        }
    }
    
}
