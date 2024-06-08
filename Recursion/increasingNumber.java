package Recursion;

public class increasingNumber {

    public static void fun(int a)
    {
       
        //if input=5 output 1,2,3,4,5

        if(a==0)
        {
        System.out.println(a);
        return;
        }
       
        fun(a-1);
        System.out.println(a);

        

        

    }

    public static void main(String args[]) {
    fun(5);
    }
    } 


    

