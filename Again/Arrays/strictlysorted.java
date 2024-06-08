package Again.Arrays;

import java.util.Arrays;

public class strictlysorted {

    public static void main(String[] args) {
        
        int [][] matrix={
            {1,2,3,4},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15},
         };
            int target=5;
            System.out.println(Arrays.toString(search(matrix, target)));
            
        }   

        static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
            while (cStart <= cEnd) {
                int mid = cStart + (cEnd - cStart) / 2;
                if (matrix[row][mid] == target) {
                    return new int[]{row, mid};
                }
                if (matrix[row][mid] < target) {
                    cStart = mid + 1;
                } else {
                    cEnd = mid - 1;
                }
            }
            return new int[]{-1, -1};
        }
    
    static int [] search(int[][]matrix,int target)
    {
        // function which brings down the sraerch to minimum two rows

        int rows=matrix.length;
        int column=matrix[0].length;

        int rStart=0;
        int rEnd= rows-1;
        int cMid=column/2; // column mid
            while(rStart<rEnd-1)  // this loop sould break when number of rows becomes two! 
            {
                int rMid=rStart+(rEnd-rStart)/2; // middle row
                if(matrix[rMid][cMid]==target) // middle elemnt of the matrix
                {
                    return new int[]{rMid,cMid};
                }
                else if(matrix[rMid][cMid]<target)
                {
                    // we have to ignore all the above rows
                    rStart=rMid;
                }
                else
                {
                    // if it is bigger than the targte ignore all the later rows
                    rEnd=rMid;
                }
            }
            // now i have only two rows left


            // if (matrix[rStart][cMid] == target) {
            //     return new int[]{rStart, cMid};
            // }
            if (matrix[rStart + 1][cMid] == target) {
                return new int[]{rStart + 1, cMid};
            }
    
            // search in 1st half
            if (target <= matrix[rStart][cMid - 1]) {
                return binarySearch(matrix, rStart, 0, cMid-1, target);
            }
            // search in 2nd half
            if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]) {
                return binarySearch(matrix, rStart, cMid + 1, column - 1, target);
            }
            // search in 3rd half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
            } else {
                return binarySearch(matrix, rStart + 1, cMid + 1, column - 1, target);
            }

    }
}
