package Recursion;

public class factoriall {
    
    static int factorial(int n)
    {
        if(n==0)
        return 1;
        int f=n*factorial(n-1);
        return f;
    } 
    
  

    public static void main(String args[]) {
    int n=100;
    System.out.println(factorial(n));
    }

}
    


    

