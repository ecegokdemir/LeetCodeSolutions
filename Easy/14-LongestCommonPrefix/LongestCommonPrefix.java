    public class LongestCommonPrefix {
       
        public static void main(String[] args) {

        }
    
        public static String longestCommonPrefix(String[] strs) {

            String str = strs[0];
    
            for (int i = 1; i < strs.length; i++) {
    
                while (strs[i].indexOf(str) != 0)
                str = str.substring(0, str.length() - 1);

            }
    
            return str;
        }
}