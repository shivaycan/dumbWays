package Again.Recursion;

public class fibonaci {
    //using recursion
    public static void main(String[] args) {
        printFibonaci(5);
    }
    
    static void printFibonaci(int upto)
    {
        for(int i=0;i<=upto;i++)
        {
            System.out.print(fun(i)+" , ");
        }
    }

    static int fun(int i)
    {
        int value=0;
        if(i==0 || i==1)
        {
            return i;
        }
        else{
            value=fun(i-2)+fun(i-1);
        }
        return value;
    }
    
}
