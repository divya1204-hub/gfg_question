package Hashing;

import java.util.HashMap;
//concepts use : temp[]+hashing+longestsub arr
public class SameSumBA {
    static int maxCommmon(int []arr,int[]brr){
//        int res=0;
//        for(int i=0;i<arr.length;i++){
//           int  sum1=0,sum2=0;
//            for(int j=i;j<arr.length;j++){
//                sum1 +=arr[j];
//                sum2 += brr[j];
//                if(sum1==sum2){
//                    res= Math.max(res,j-i+1);
//                }
//            }
//
//        }
//        return res;

        int []temp=new int[arr.length];
        int res=0,pre_sum=0,sum=0;
        HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i]-brr[i];

        }
        for(int i=0;i<temp.length;i++)
        {
            pre_sum +=temp[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(m.containsKey(pre_sum)==false) {
                m.put(pre_sum,i);
            }
            if(m.containsKey(pre_sum-sum)){
                res= Math.max(res,i-m.get(pre_sum-sum));    //takes elements of temp array as key and returns index as
                                                               //Value
            }
        }
        return res;


    }


    public static void main(String[] args) {
        int []a={0,1,0,0,0,0};
        int []b={1,0,1,0,0,1};
        System.out.println(maxCommmon(a,b));

    }
}
//temp[i]={-1,1,-1.0,0,-1}: i=0; j=0 ;pre_sum=-{-1,0,-1,-1,-1,-2}
                                      //m={-1,0}
                                    //m={}