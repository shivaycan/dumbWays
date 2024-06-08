package strings;

public class compareTo {

    public static void main(String args[])
    {
        String fruits[]={"apple","mango","guava"};
        String largest=fruits[0];
        {
            //print largest among all strings lexographically

            for(int i=0;i<fruits.length;i++)
            {
               if(largest.compareTo(fruits[i]) <0)
               {
                // largest < the current fruit
                largest =fruits[i];
               }
               //compareTo func 0:equal , <0:1<2 , >0 1>2

            }
            System.out.println(largest);
        }
    }
    
}
