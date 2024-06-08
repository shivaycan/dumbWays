package Again.Arrays;

import java.util.Arrays;

public class binarysearchIn2d {

    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},    //Sorted -> column wise and  row wise 
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50},
        };
        int target=10;

         int[] result=SortedRowColumn(matrix, target);
         System.out.println(Arrays.toString(result));
        
    }

    static int[] SortedRowColumn(int[][] matrix,int target)
    {
        int row=0;
        int column=matrix[row].length-1;

        while(row<matrix.length && column>=0)
        {
            if(matrix[row][column]==target)
            {
                return new int[]{row,column}; 
            }
            else if(matrix[row][column]<target)
            {
                row++;
            }
            else
            {
                column--; 
            }
        }
        return new int[]{-1,-1};
    }
    
}
