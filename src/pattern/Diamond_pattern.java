package pattern;

public class Diamond_pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int l = 1; l <= 10; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= 10 - l; n++) {
                System.out.print("* ");




            }
            System.out.println();
        }
    }
}
