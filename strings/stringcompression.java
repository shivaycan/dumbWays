package strings;

public class stringcompression {

    public static StringBuilder compress(String stg) {
         //wrapper  class instead of primitive data type
        StringBuilder sb =new StringBuilder("");

       
        //track
        for(int i=0;i<stg.length();i++)
        {
            Integer count=1;
            while(i<stg.length()-1 &&stg.charAt(i)==stg.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(stg.charAt(i));
            if(count>1)
            sb.append(count);
           
        }
       return sb;
    }
     
    public static void main(String args[]) {

    String stg="abcccd";
    System.out.println(compress(stg));
    
    }
    } 
    

