package STACK;

import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {// fabonnachi series
         int n1=0, n2=1 ,n3,N=5;

        System.out.print(n1+" "+n2);
        for(int i=2;i<N;i++){
            n3=n1+n2;
            System.out.print(n3);
            //updation
            n1=n2;
            n2=n3;


        }

    }
}

//12345//how to print a number in reverse and straight order.
//rotating leftmost digit of a number