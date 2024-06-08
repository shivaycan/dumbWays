package Recursion.Striver;

public class namess {

   public static void names(int i,int n)
   {
    //func 1
    if(i>n) //base case
    return;

    
     System.out.println("Shivay");
     names(i+1,n);
   }
     //func 2

     
    static void number(int n)
    {
        if(n==0) //base case
    return;

    
     System.out.println(n);
     number (n-1);

    }

    public static void main(String[] args) {
        //print a name n times using recursion
        //int i,n;
        number(6);


    }
    
}
