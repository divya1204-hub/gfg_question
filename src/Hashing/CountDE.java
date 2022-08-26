package Hashing;

import java.util.*;
public class CountDE {
    public static void main(String[] args) {
        int []arr = {12,17,19,17,19,23,67,34,23,34};
        HashSet<Integer>c= new HashSet<Integer>();

          for(int i=0;i<arr.length;i++){
             c.add(arr[i]);

          }

        System.out.println(c.size());
        System.out.println(c);
    }
}
