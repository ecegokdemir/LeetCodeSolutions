import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
       
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }

    /*
        Given a string s, find the length of the longest 
        substring
        without repeating characters.

        Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
       
        Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
       
        Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
}
