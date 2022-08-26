//brian algorithm
public class BITMANIPULATION_COUNTBITS {
    static int countBits(int N){
        int count=0;
        while(N!=0){
            N=(N&(N-1));
            count++;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(15));
    }
}
