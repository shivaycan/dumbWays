package Again.MathsForDSA;

import java.util.Scanner;

public class toAnySystem {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the decimal number");

        int decimal=sc.nextInt();

        System.out.println("Enter the base you want to convert in");
        
        int base=sc.nextInt();

        String converted=conversion(decimal,base);

        System.out.println(converted);

        sc.close();
    }

    public static String conversion(int dec,int base)
    {
        StringBuilder converted= new StringBuilder();

        if(dec==0)
        converted.append(0);

        else{
            while(dec>0)
            {
                int rem=dec%base;
                converted.insert(0, rem);
                dec/=base;
            }
        }
        return converted.toString();
        
    }
}
