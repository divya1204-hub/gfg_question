package pattern;

public class pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=11-i;j++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
