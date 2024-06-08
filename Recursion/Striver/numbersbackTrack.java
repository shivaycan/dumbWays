package Recursion.Striver;

public class numbersbackTrack {

    static void BackTrack(int i,int n)
    {
        if(i==0)
        return;

        BackTrack(i-1, n); //first callng the function
        System.out.println(i);
    }
    public static void main(String[] args) {
       BackTrack(5, 5);
        
    }
    
}
