package Array;

import java.util.Arrays;

public  class Maxmin {
    //create method
    public static void Maxminele(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);

        }
    }





    public static void main(String[] args) {
        int[] Array={1,2,3,4,5};

        Maxminele(Array);
        System.out.println("Maximum element array is"+" "+Array[0]+" Minimum element"+" "+Array[4]);

        }
}

