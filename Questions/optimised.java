package Questions;

public class optimised {
   

    public static void main(String args[]) {

        int n=1000000000;
       
        for(int i=1;i<=n;i++)
        {
             int factCount=0;
            for(int j=1;j<=n;j++)
            {
              if(i%j==0)
              {
                factCount++;
              }
              
            }
            if(factCount==2)
              {
                System.out.println(i);
              }
        }
        }
    

    }
     
    



