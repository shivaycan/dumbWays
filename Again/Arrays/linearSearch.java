package Again.Arrays;

public class linearSearch {

    public static void main(String[] args) {

        int [] array={1,3,4,2,8};
        int key=9;

        System.out.println(search(array,key));
        
    }

    static int search(int[] array,int key)
    {
        if(array.length==0)
        {
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element == key) {
                return index;
            }
        }
        return -1;
    }
    
}
