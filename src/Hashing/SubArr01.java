package Hashing;

import java.util.HashMap;
import java.util.*;

public class SubArr01 {
    static int SubArr(int []arr){
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        int pre_sum=0,res=0, sum=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                arr[i] = -1;

            }
        }
                for(int i=0;i<arr.length;i++)
                {
                    pre_sum +=arr[i];
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
        int []a={1,0,1,1,1,1,0,0,1,1};
        System.out.println(SubArr(a));

    }
}
