package Hashing;

import java.util.Arrays;

public class MyHashOA {
    //implementation of open addressing
    int []arr;
    int cap,size;
     MyHashOA(int c) {          //constructor
         cap = c;
         size = 0;
         for (int i = 0; i < cap; i++) {
             arr[i] = -1;
         }
     }
     int hash(int key){     //method
           return key%cap;
        }

        //implementing insert
    boolean insert(int key){
        if(size==cap)
            return false;
        int i= hash(key);
         while((arr[i]!=key) && (arr[i]!=-1) && (arr[i]!=-2)) {

             i = (i + 1) % cap;
         }
             if (arr[i] == key) {
                 return false;
             } else {
                 arr[i] = key;
                 size++;
                 return true;
             }
         }
         //implementing search
    boolean search(int key){
        int h= hash(key);
        int i=h;
        while(arr[i]!=-1)
            return true;
        i=(i+1)%cap;
        if(i==h){
            return false;

        }
        return false;
    }
         //implementing  erase
    boolean erase(int key){
        int h= hash(key);
        int i=h;
        while(arr[i]!=-1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }

            i = (i + 1) % cap;


            if (i == h)
                return false;
        }

        return false;
    }
    void print(){

        System.out.println(Arrays.toString(arr));
    }



public static void main(String[] args) {
         MyHashOA m= new MyHashOA(6);
         m.insert(23);
         m.insert(34);
         m.insert(56);
         m.insert(78);
         m.insert(89);
         m.insert(90);
         m.print();





    }
}
