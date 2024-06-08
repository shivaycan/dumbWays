package Again.Recursion.Level1.ArrayQuestions;

public class checkAseending {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,3};
            boolean ans=checkAssen(arr, 0);
            System.out.println("Is Assending: "+ ans);
        
    }
    static boolean checkAssen(int []arr,int i)
    {
        if(i==arr.length-1) return true;

        ///logic
        if(arr[i]>arr[i+1]) return false;
        
        //recursive call
        return checkAssen(arr, i+1);
    }
    
}
