package Array;
//T.C=O(N)

public class RevArr{
    public static void Reverse(int[]arr, int start, int end) {
        int temp;
        int n=arr.length;
        if(start>=end)
            return;
        //swap
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        Reverse(arr, start+1, end-1);

    }
    //for printing array on a line
    public static void Print(int[]arr,int size){
        for(int i=0;i< size;i++)
        System.out.println(arr[i]+" ");
        System.out.println(" ");

        }



    public static void main(String[] args) {
       int []array={1,2,3,4,5,6};
       Print(array, 6);
        Reverse(array,0,5);
        System.out.println("reversed array is");
        Print(array,6);
    }


}

