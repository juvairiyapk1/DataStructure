package stack;


import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "good";
        String reverse=reverseString(str);
        System.out.println(reverse);
    }

    public static String reverseString(String str){
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reverse=new StringBuilder();
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
