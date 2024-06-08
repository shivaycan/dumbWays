package strings;

public class compareToc {
    public static void compare(String[] name)
    {
        String largest=name[0];
        for(int i=0;i<name.length;i++)
        {
            if(largest.compareTo(name[i])==0)

            {
                largest=name[i];
            }
        }
        System.out.println(largest);

        
    }


    public static void main(String args[]) {
    //to compare two stings lexicoraphical method


    String name[]={"mango","apple","peach"};
    compare(name);

    }
    } 

