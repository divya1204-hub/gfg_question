//package STACK;
//// [10,5,15,20,25    ||  30,40,45,50,55];top1=25;top2=30
//public class twoStacks {
//    int arr[], cap, top1, top2;
//
//    static void stacks(int n) {
//        int cap = n, top1 = -1, top2 = cap;
//        int[] arr = new int[n];
//    }
//
//    void push1(int x) {
//        if (top1 < top2 - 1) {
//            top1++;
//            arr[top1] = x;
//
//        }
//
//    }
//
//    void push2(int x) {
//        if (top1 < top2 - 1) {
//            top2--;
//            arr[top2] = x;
//
//        }
//    }
//
//    int pop1() {
//        if (top1 >= 0) {
//            int x = arr[top1];
//            top1--;
//            return x;
//        } else {
//            System.exit(1);           //underflow
//        }
//        return 0;             //when no condition is followed, we return zero.
//    }
//
//    int pop2() {
//        if (top2 < cap) {
//            int x = arr[top2];
//            top2++;
//            return x;
//        } else {
//            System.exit(1);
//        }
//
//
//        return 0;
//    }
//
//
//    public static void main(String[] args) {
