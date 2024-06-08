package Again.Recursion.Level1;

public class onetozero {

public static void main(String[] args) {
    both(5);
}
static void fun(int n)
{
    if(n==0)
    {
        return;
    }
    both(n-1);
    System.out.print(n);
}

static void both(int n) //from 1-n and n-1
{
    if(n==0)
    {
        return;
    }
    
    both(n-1);
    System.out.print(n);
  
}
    
}
