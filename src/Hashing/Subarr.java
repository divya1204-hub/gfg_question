package Hashing;

import java.util.*;
public class Subarr {
    static boolean isSubarray(int arr[]) {
        HashSet<Integer> m = new HashSet<Integer>();
        int pre_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m.contains(pre_sum)) {
                return true;
            }
            if (pre_sum == 0) {   //for condtions like [-3,-2,1,4]
                return true;
            }
            m.add(pre_sum); // if presum becomes 0 it will further add and check for next element.
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {-3, -2, -1, 5,9};
        System.out.println(isSubarray(a));

    }
}