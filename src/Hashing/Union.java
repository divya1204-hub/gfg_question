package Hashing;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
            int []a={15,20,5,15};
            int []b={15,15,15,20,10};
        HashSet<Integer>v = new HashSet<Integer>();
            for(int i=0;i<a.length;i++){
                v.add(a[i]);
            }
            for(int j=0;j<b.length;j++){
                v.add(b[j]);
            }
        System.out.println(v.size());
        System.out.println(v);
    }
}
