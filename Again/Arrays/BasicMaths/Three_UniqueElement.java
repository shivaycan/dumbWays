package Again.Arrays.BasicMaths;

public class Three_UniqueElement {

    public static void main(String[] args) {
       
        int[] arr= {2,3,3,4,2,6,4};
        int unique=0;
        for(int a : arr)
        {
            unique=unique^a;
        }
        System.out.println(unique);
        
    }
    
}
