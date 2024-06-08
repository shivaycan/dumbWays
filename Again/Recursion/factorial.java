package Again.Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5)); 
        
    }
    static int fact(int n)
    { 
        if(n==0)
        {
           return 1;
        }
        int f=n*fact(n-1);
        return f;
        
    }
    
}
