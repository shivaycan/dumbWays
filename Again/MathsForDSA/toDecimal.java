package Again.MathsForDSA;

public class toDecimal {
    public static void main(String[] args) {
        //idenatify the unique number

        int arr[]={1,3,3,5,5,7,7,9,9};
        int unique=0;
        
        for(int a: arr)
        {
            unique=unique^a;
        }
        System.out.println(unique);
        
    
    }
    
}
