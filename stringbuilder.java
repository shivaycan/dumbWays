public class stringbuilder {

    public static void main(String args[]) {

        //newway of using strings in java 

        StringBuilder sb= new StringBuilder("");
        for(char ch='A';ch<='Z';ch++)
        {
           sb.append(ch);
        }
        //here unlike string when a new character is added its not copied again and again just kept appending to the end
        System.out.println(sb);
        
    }
    } 
    

