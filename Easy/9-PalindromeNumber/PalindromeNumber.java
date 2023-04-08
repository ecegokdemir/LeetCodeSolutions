
public class PalindromeNumber {

    public static void main(String[] args) {
      
        System.out.println(isPalindrome(10000021));
        //System.out.println(isPalindrome(112311));

        /*if(pal.charAt(0)==pal.charAt(pal.length()-1)){
            pal=pal.substring(1, pal.length());
            x = Integer.parseInt(pal);
            return x;
         }*/
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
            }//if(i==((chars.length-2)%2)){return true;}
         }

        return true;

    }
}