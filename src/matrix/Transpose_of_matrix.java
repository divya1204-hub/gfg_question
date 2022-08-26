package matrix;

import java.lang.System;
import java.util.Arrays;

public class Transpose_of_matrix {
    public static void Transpose(int[][] arr) {
        int n = arr.length;
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                temp[i][j] = arr[i][j];


            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = temp[j][i];


            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        Transpose(a);

                System.out.println(Arrays.deepToString(a));

            }


        }



