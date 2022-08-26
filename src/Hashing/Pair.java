package Hashing;

import java.util.HashSet;

public class Pair {
      static boolean  isPair(int []a, int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (s.contains(sum - a[i])) {
                return true;

            }
            s.add(a[i]);

        }
        return false;
    }


    public static void main(String[] args) {
        int a[]={11,5,6};
        int sum=17;
        System.out.println(isPair(a,sum));

        }


    }

