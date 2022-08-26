package Hashing;

import java.util.*;


public class Intersection {
    public static void main(String[] args) {
        int []a ={10,15,20,15,20,30,40,30};
        int []b={35,78,20,30,10,15};

        HashSet<Integer>m=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            m.add(a[i]);  //it removes all the duplicate elements from a[]
        }
        int res=0;       //result=0
        for(int j=0;j<b.length;j++){
            if(m.contains(b[j])){
                res++;// res will be increased if new m and elements of b[] will match
                m.remove(b[j]); // it will not store the repeated element again
                                // and remove elements from m[] if found duplicate and also increse res

            }

        }
        System.out.println(res);
        System.out.println(m);


    }
}
