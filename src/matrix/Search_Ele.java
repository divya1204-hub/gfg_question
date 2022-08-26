package matrix;

public class Search_Ele {        //ina sorted 2D matrix
    static void Search(int [][]mat,int x,int R,int C) {

        int i=0,j=C-1;
        while(i<R && j>=0){    //checking from top right corner element
                if (x == mat[i][j]) {
                    System.out.println("found at (" + i + "," + j + ")");
                                return;
                }
                else if (x >mat[i][j]) {
                    i++;
                } else {
                    j--;
                }

            }
        System.out.println("not found");

        }


    public static void main(String[] args) {
        int [][]arr={{10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};
            Search(arr,390,4,4);
    }
}
