package Recursion;

public class sumOfallNaturalNumber {


    public static int fun(int n){
        int sum=0;
        if(n==0)
        {
        sum=0;
        return sum;
        }
        sum=n+fun(n-1);
        return sum;

        
    }
    public static void main(String[] args) {
        System.out.println("The sum for the fun(5));
        
    }
    
}
