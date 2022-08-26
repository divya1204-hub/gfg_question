package matrix;

public class Spiral_Matrix {
    static void SpiralPrint(int [][]mat,int R,int C){
        int top=0,bottom=R-1,left=0,right=C-1;
        while(top<=bottom && left<=right) {
            //for printing the top row
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i]+" ");
            }
            top++;
            //for printing right coloumn
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right]+" ");
            }
            right--;
            //for printing bottom
            if(top<=bottom) {
                for (int i = right; i >=left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            //for printing left coloumn
            if(left<=right) {
                for (int i = bottom; i >=top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        SpiralPrint(arr,4,4);


    }
}
