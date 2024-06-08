package strings.Questions;

public class countlowwercase {

    //count all lowerer case by user
public static void countlowercase(String str) 
{
    int count =0;
    for(int i=0;i<str.length();i++)
    {
        
        char ch=str.charAt(i);
      
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
            count++;
        
        
    }
    System.out.print(count);  

}

    public static void main(String args[]) {

        String str="AEIOUaeiu";
        countlowercase(str);
    
    }
    } 
    

