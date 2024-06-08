package Again.MathsForDSA;

public class magicNumber {
    public static void main(String[] args) {
        //magic number is the multipilcation of power of 5 to the binary values of any number n
        
        int n=6;
        int ans=0;
        int i=1;

        while(n>0)
        {
          ans+=(n&1)*Math.pow(5, i);
          n >>= 1;
          i++;
        }
        System.out.println(ans);
    }
    
}
