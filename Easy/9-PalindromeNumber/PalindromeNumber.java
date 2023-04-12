
public class PalindromeNumber {

    public static void main(String[] args) {
      
    }

    public static boolean isPalindrome(int x) {

         String pal= Integer.toString(x);
         char[] chars = new char[pal.length()];

         if(pal.length()==1){
            return true;
         }
            
         for (int i = 0; i < pal.length(); i++) {
            chars[i]=pal.charAt(i);
         }

         for (int i = 0; i < chars.length; i++) {
            if(chars[i]!=chars[(chars.length-1)-i]){
                return false;
            }
         }

        return true;
    }

    /*
      Given an integer x, return true if x is a palindrome, and false otherwise.

      Example 1:

      Input: x = 121
      Output: true
      Explanation: 121 reads as 121 from left to right and from right to left.

      Example 2:
      Input: x = -121
      Output: false
      Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

      Example 3:
      Input: x = 10
      Output: false
      Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
}