package strings;
//import java.util.*;

public class shortestpath {
    

    public static void getShortestpath(String path)
    {
       int x=0,y=0;
       int i=0;
       while(i<path.length())
       {
          if(path.charAt(i)=='E')
          {
             x++;
          }
           if(path.charAt(i)=='S')
          {
             y--;
          }
           if(path.charAt(i)=='W')
          {
             x--;
          }
           if(path.charAt(i)=='N')
          {
             y++;
          }

         i++;
       }
       System.out.println(x+","+y);
    }
    public static void main(String args[])
    {
       String path="WNEENESENNN";
       getShortestpath(path);
       
    }
}
