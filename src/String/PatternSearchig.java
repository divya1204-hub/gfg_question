package String;
import java.util.*;
//naive 1
class PatternSearch {
    static void search(String s1,String s2) {
        for (int i = 0; i < s1.length() - s2.length()+1; i++) {        //for taking initial characters

                if (s2.equals(s1.substring(i, i+s2.length()))) { //0, 0+3, 1,4,2,5
                    System.out.print(i+" ");



                }
            }
        }
static void PatSearching(String s1 ,String s2) {
    int m = s2.length();
    int n = s1.length();
    for (int i = 0; i <= n - m; i++) {           // whole text s1 traverse
        for (int j = 0; j < m; j++) {                  // desired pattern s2
            if (s2.charAt(j) != s1.charAt(i + j)) {
                break;
            }


            if (j==m-1) {
                System.out.println(i + " ");
            }
        }

    }
}


//naive solution 3
    static void PatSearchingDis(String s1 ,String s2) {
        int m = s2.length();
        int n = s1.length();
        for (int i = 0; i <= n - m; i++) {           // whole text s1 traverse
            int j;
            for ( j = 0; j < m; j++) {                  // desired pattern s2
                if (s2.charAt(j) != s1.charAt(i + j)) {
                    break;
                }

            }
                if (j==m) {
                    System.out.println(i + " ");
                }
                if(j==0){
                    i++;     // that means a character is different so we go next immidiate character to check instead
                              // of sliding through the whole string.
                }
                else
                    i=(i+j);        // it means we got our desired  chracter and hence we can print the pattern index
            }

        }







    public static void main(String[] args)
        {
//            search("geeksforgeeks","eks");
//            System.out.println();
//            search("AAAAA","AAA");
            //PatSearching("geeksforgeeks","eks");
           // PatSearchingDis("geeksforgeeks","eks");

        }

    }

    // naive 2 approach
// efficient approach-rabin krap method\

// in this method




