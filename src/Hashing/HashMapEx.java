package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer>m= new HashMap<String,Integer>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses",20);
        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String,Integer>c:m.entrySet()){          //for each loop
            System.out.println(c.getKey()+" "+c.getValue());


        }
        System.out.println(m.get("gfg")); //returns value but takes key
    }
}
