package STACK;

import java.util.Stack;

public class Paranthesis {
    static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            }
            else {
                if (s.isEmpty() == true)
                    return false;
                else if (matching(s.peek(),str.charAt(i))==false)   //true!=false //checks closing bracket   s.peek=(, charAt=)
                    return false;

                else
                    s.pop();
            }
        }
        return (s.isEmpty()==true);
    }
    public static boolean matching(char a,char b){
        return(a=='('&&b==')'||a=='['&&b==']'|| a=='{'&& b=='}');
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{()}"));
    }
}
