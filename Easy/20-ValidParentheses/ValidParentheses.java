import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("){"));
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

/* for (int i = 0; i < s.length(); i=i+2) {
            switch (s.charAt(i)) {
                case '(':
                    if(s.charAt(i+1)!=')'){
                    return false;
                    } 
                    break;
                case '[':
                    if(s.charAt(i+1)!=']'){
                    return false;
                    }
                    break;
                case '{':
                    if(s.charAt(i+1)!='}'){
                    return false;
                    }
                    break;
            }
        } */