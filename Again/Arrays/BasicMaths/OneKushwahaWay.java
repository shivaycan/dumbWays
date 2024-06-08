package Again.Arrays.BasicMaths;

public class OneKushwahaWay {

    public static void main(String[] args) {
        
        int n=62;

        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n)
    {
        return (n & 1) == 1 ;

        //return true if (n & 1) == 1 amd return false if not.
    }
    
    

}
