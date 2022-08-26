package Hashing;

import java.util.HashMap;
import java.util.*;
import java.math.*;

public class LongestSubArr {
   static int mxlen(int []a ,int sum){
        int pre_sum=0,res=0;
        HashMap<Integer,Integer>m =new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++)
        {
            pre_sum +=a[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(m.containsKey(pre_sum)==false) {
                m.put(pre_sum,i);
            }
                if(m.containsKey(pre_sum-sum)){
                    res= Math.max(res,i-m.get(pre_sum-sum));
            }
        }
       return res;
   }

    public static void main(String[] args) {
int []arr={8,3,1,5,-6,6,2,2};
        System.out.println(mxlen(arr,4));

    }
}
