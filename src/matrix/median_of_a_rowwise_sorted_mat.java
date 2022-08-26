package matrix;

import java.util.*;

public class median_of_a_rowwise_sorted_mat {
   static  int Median(int[][] mat, int r, int c) {
        int min = mat[0][0], max = mat[0][c - 1];
        //for storing max and min positions
        for(int i=1;i<r;i++) {
            if (mat[0][0] < min) {
                min = mat[0][0];
            }
            if (mat[0][c - 1] > max) {
                max = mat[0][c - 1];
            }
        }

            //calculate the formula of median
            int medPosition = (r * c + 1) / 2;

            //calculte mid and midPos to compare between midpos and medposition

            while (min < max) {
                int mid = (min + max) / 2;
                int midPos = 0;
                //for binary search
                for (int i = 0; i < r; i++) {
                    int pos = Arrays.binarySearch(mat[i], mid)+1;
                    midPos += Math.abs(pos);

                }

                if(midPos<medPosition)
                    min=mid+1;
                else
                    max=mid;

            }
            return min;
        }


        public static void main (String[]args){

       int [][]arr={{1,5,8,20},{9,10,11,12},{15,17,19,25}};
            System.out.println(Median(arr,3,4));
        }
    }

