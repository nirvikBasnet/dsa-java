package leetcode;
import java.util.Stack;

class valid_parentheses{
    public static void main(String[] args) {
        String s = "{[()]}";

        isValid(s);
    }

    public static boolean isValid(String s){

        if(s.length()%2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
           
                if( c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
                    
                    stack.pop();
                    
                }else if(c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                    
                    stack.pop();
                    
                }else if(c == ']' && !stack.isEmpty() && stack.peek()=='['){
                    
                    stack.pop();
                    
                } else {
                    return false;
                }
        }

        System.out.println(stack.isEmpty());



        return stack.isEmpty();
    }
}