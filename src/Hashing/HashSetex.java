package Hashing;

import java.util.*;
public class HashSetex {
    public static void main(String[] args) {
        HashSet<String>h= new HashSet<String>(6);
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h);
        System.out.println(h.contains("ide"));

        Iterator<String>i= h.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

}

