public class ValidPalindrome {

    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(String s) {

    
            s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                
            for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt((s.length()-1)-i)){
               return false;
             }
                
            }

        return true;  
    }
}