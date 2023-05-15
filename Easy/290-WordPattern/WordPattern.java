import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {

    }  

    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> myMap = new HashMap<Character, String>();
        String[] myArr = s.trim().split(" ");

        if(pattern.length()!=myArr.length){
            return false;
        }

        for (int i = 0; i < pattern.length() ; i++) {
            if(myMap.containsKey(pattern.charAt(i))){
                if (!(myMap.get(pattern.charAt(i)).equals(myArr[i]))) {
                    return false;
                }
            } else {
                if(myMap.containsValue(myArr[i])){
                    return false;
                }
                myMap.put(pattern.charAt(i),myArr[i]);
            }
        }
        return true;
    }

    /*
    Given a pattern and a string s, find if s follows the same pattern.

    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

    Example 1:
    Input: pattern = "abba", s = "dog cat cat dog"
    Output: true
   
    Example 2:
    Input: pattern = "abba", s = "dog cat cat fish"
    Output: false
    
    Example 3:
    Input: pattern = "aaaa", s = "dog cat cat dog"
    Output: false
    
    Constraints:
    1 <= pattern.length <= 300
    pattern contains only lower-case English letters.
    1 <= s.length <= 3000
    s contains only lowercase English letters and spaces ' '.
    s does not contain any leading or trailing spaces.
    All the words in s are separated by a single space.
     */
}