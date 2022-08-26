package Hashing;

import java.util.*;
public class SubArrSum {
    static boolean isBoolean(int []arr,int sum){
        HashSet<Integer>m=new HashSet<Integer>();
       int pre_sum=0;
        for(int i=0;i< arr.length;i++){
            if(pre_sum==sum){
                return true;
            }
            if(m.contains(pre_sum-sum)){
                return true;
            }

            m.add(pre_sum);
        }
return false;
    }
    public static void main(String[] args) {
       int []a={5,8,6,13,3,-1};
        System.out.println(isBoolean(a,89));
    }
}
