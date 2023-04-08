
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
}