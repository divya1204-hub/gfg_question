package Hashing;

import java.util.*;
import java.util.Map;
public class CoutFreq {
    public static void main(String[] args) {
        int []arr = {12,17,19,17,19,23,67,34,23,34};
        HashMap<Integer,Integer>Z= new HashMap<Integer,Integer>();
        for(int x:arr) {
            Z.put(x, Z.getOrDefault(x, 0) + 1);
        }
            for (Map.Entry<Integer,Integer>e:Z.entrySet()){
                System.out.println(e.getKey()+" "+ e.getValue());
        }
    }
}
