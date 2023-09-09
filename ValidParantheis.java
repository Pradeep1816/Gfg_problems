import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParantheis {
    static boolean checkExp(String str){
           Deque<Character> stack=new ArrayDeque<Character>();
            //Stack<Character> stack=new Stack<>();
            for(char i=0;i<str.length(); i++){
                char x=str.charAt(i);
                if(x=='(' ||x=='{'||x=='['){
                    stack.push(x);
                    continue;
                }
                if(stack.isEmpty()){
                    
                    return false;
                }
                char ch;
                switch(x){
                    case ')':
                    ch=stack.pop();
                    if(ch=='[' || ch=='{'){
                        return false;
                    }
                    break;
                    case '}':
                    ch=stack.pop();
                    if(ch=='[' || ch=='('){
                        return false;
                    }
                    break;
                    case ']':
                    ch=stack.pop();
                    if(ch=='(' || ch=='}'){
                        return false;
                    }
                    break;
               }

            }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String expr = "([{}])";
        if(checkExp(expr)){
            System.out.println("Balanced");
        }else{
            System.out.println("Unbalanced");
        }
    }
}
