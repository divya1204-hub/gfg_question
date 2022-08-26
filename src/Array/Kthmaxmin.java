package Array;
import java.util.Arrays;

public class Kthmaxmin {
    public static Integer Kthamaxmin(Integer[] arr, int k){

                // Sort the given array
                Arrays.sort(arr);

                // Return k'th element in
                // the sorted array
                return arr[k - 1];
            }

            // driver program
            public static void main(String[] args)
            {

                Integer arry[] = new Integer[] { 12, 3, 5, 7, 19 };


                System.out.print("K'th smallest element is " + Kthamaxmin(arry, 2));
            }
        }


        //next code
/* the following code demonstrates how to find kth smallest
element using set from Java Collections */










