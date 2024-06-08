package Again.Recursion;

public class Sample {

    public  void main(String[] args) {
        
        //fibonaci series
        int n=10;
        
        printseries(n);
    }

   public static void printseries(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(fib(i)+ " ");
        }
    }

    public static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }
       return fib(n-1)+fib(n-2);
    }  
}
int obj= new Sample;
obj.main();
