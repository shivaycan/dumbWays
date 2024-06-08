package Again.Arrays.BasicMaths;

//arey murkh tu pehle number ko binary me kyon kar raha hai computer ke liye number already  binary me hi hota hai

public class One {

    public static void main(String[] args) {
        System.out.println(isOdd(num));
    }
    static boolean isOdd(int num)
    {
        (toBinary(num) & 1) == 1 ;
    }

    int[] toBinary(int num)
    {
        
        int i=0;
        int[] rem = new int[20];
        while(num==1)
        {
            rem[i]=num%2;
            num=num/2;
            i++;
        }

        int start = 0;
        int end = rem.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            Integer temp = rem[start];
            rem[start] = rem[end];
            rem[end] = temp;
            // Move start index towards the end
            start++;
            // Move end index towards the start
            end--;
        }

        return rem;

    }
    
}
