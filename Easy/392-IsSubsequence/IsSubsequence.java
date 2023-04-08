public class IsSubsequence {

    public static void main(String[] args) {
       
    }

    public static boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i==s.length(); 
      }
        
 }


/*int n = s.length(), m = t.length();
    int i = 0, j = 0;
    while (i < n && j < m) {
        if (s[i] == t[j])
            i++;
        j++;
    }
    /*If i reaches end of s1,that mean we found all
    characters of s1 in s2,
    so s1 is subsequence of s2, else not
    return i == n;*/