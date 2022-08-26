package Hashing;

import java.util.*;
public class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>>table;
    MyHash(int b){
        BUCKET =b;
        table= new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    // INSERT
    void insert(int key){
        int i=key%BUCKET;
        table.get(i).add(key);
    }
    //REMOVE
    void delete(int key){
        int i=key%BUCKET;
        table.get(i).remove((Integer)i);
    }
    //search
    boolean search(int key){
        int i=key%BUCKET;
       return table.get(i).contains(key);
    }
    public static void main(String[] args) {
        MyHash m =new MyHash(10);
        m.insert(10);
        m.insert(39);
        m.insert(89);
        m.insert(40);
        boolean searchres= m.search(39);
        System.out.println(searchres);


       m.delete(10);
        System.out.println(m.search(10));

    }
}
