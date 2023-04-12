import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
       
    }

    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        
        if(s.length()%2!=0){return false;}

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    myStack.push('(');
                    break;
                case ')':
                    if(myStack.isEmpty()==true || myStack.pop()!='('  ){
                     return false;
                    }
                break; 
                case '[':
                myStack.push('[');
                break;
                case ']':
                if(myStack.isEmpty()==true || myStack.pop()!='['   ){
                    return false;
                   }
                break; 

                case '{':
                myStack.push('{');
                break;
                case '}':
                if(myStack.isEmpty()==true   || myStack.pop()!='{'){
                    return false;
                   }
                break;
            }
        } if(myStack.size()!=0){return false;}
        return true;
    }
}

        /* 
        Given a string s containing just the characters 
        '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
        
        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false
        */