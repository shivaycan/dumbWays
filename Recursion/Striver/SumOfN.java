package Recursion.Striver;

public class SumOfN {
    //sum of n naturtual number using recursion

    static int Sum(int n){
        if(n==0)
        return 0;
        else
        return n+Sum(n-1);
    }

    public static void main(String[] args) {
        
        System.out.println(Sum(100));
    }
    
}
