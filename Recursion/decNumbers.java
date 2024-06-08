package Recursion;

public class decNumbers {


    static void DecNumbers (int n) {
        
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        DecNumbers(n-1);
        

    
    }
    

    public static void main(String args[]) {

        DecNumbers(10);
    

    }
    } 
    

