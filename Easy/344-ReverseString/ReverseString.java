
public class ReverseString {
    public static void main(String[] args) {

    }
    public static void reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        
        while (low<high){
            Character temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;high--;
            
        }
    }
    /*
    Write a function that reverses a string. The input string is given as an array of characters s.

    Example 1:
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    
    Example 2:
    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
    */
}
