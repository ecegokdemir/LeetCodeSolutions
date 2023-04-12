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

        /*
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
         */
}