package Recursion;

public class fibonacci {

    public static int fib(int n)
    {

        if(n==0 || n==1)
        {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
    
        return fnm1+fnm2;
    }

    public static void printFib(int n)
    {
        for(int i=0;i<n;i++)
        {
           System.out.print(fib(i)+ " ");
        }
    }

    public static void main(String[] args) {
        printFib(9);
        
    }
    
}
