package String;
//leftmost repeating element in string at which index

import java.util.Arrays;

public class LeftMost {
   static final int CHAR=256;
//    //naive solution         T.C :O(N^2)

//    static int LeftMostRE(String s){
//        for (int i=0;i<s.length();i++){            //for calculating frequency
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    return i;
//                }
//            }
//        }
//        return -1;
//
//    }


//be0tter solution                        O(n)

//isme humlog strings ka approach lagagege ,charrecter ko index ki tarah store karke
//    static void BetterApp(String s){
//        int []count= new int[CHAR];
//        for(int i=0;i<s.length();i++){          //for frequecies
//            count[s.charAt(i)]++;
//        }
//        for(int i=0;i<s.length();i++){
//            if(count[s.charAt(i)]>1){   //checking leftmost element at which index
//                System.out.println(s.charAt(i)+" "+i);
//
//                break;
//
//
//            }
//        }
//
//    }

    //efficent solution 1         T.C O(n)

//    static int Effapp1(String s){
//        int []fIndex =new int[CHAR];
//        Arrays.fill(fIndex,-1);          //so that default value changes from 0 to -1 in int[]
//        int res = Integer.MAX_VALUE;
//        for(int i=0;i<s.length();i++){
//            int fi =fIndex[s.charAt(i)];        //in fi we are storing frequency of character
//            if(fi==-1){
//                fIndex[s.charAt(i)]=i;   //it will change default value to the index number if seen.
//
//            }
//            else
//                res= Math.min(res,fi);
//
//        }
//        return(res==Integer.MAX_VALUE)?-1:res;         //this statement shows the change. if ans is -1 it means all
//                                                           //elements were distinct
//    }

    //efficient approach 2
    static int EffApp2(String s) {
        boolean[] visited = new boolean[CHAR];        //if visted it will store true
        int  res=-1;
        for (int i = s.length() - 1; i >= 0; i--) {    //traversing from right to left

           if(visited[s.charAt(i)]){
               res=i;

            }
           else
               visited[s.charAt(i)]=true;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(EffApp2("abbcccdeghh"));
    }

}
//[a,b,b,c,c,c,d,e,g,h,h]       //first for loop
//a=1,b=2,c=3,d=1,e=1,g=1,h=2
