package pattern;

public class dimond_inverted {
    public static void main(String[] args) {
        for (int l = 1; l <= 10; l++) {
            for (int m = 1; m <= l ; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= 10 - l+1; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <=10-i+1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

