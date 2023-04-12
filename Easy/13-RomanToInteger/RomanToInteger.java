
public class RomanToInteger {

    public static void main(String[] args) {
       
    }

    public static int romanToInt(String s) {
        
        int num = 0;
        char c = ' ';
        char before = ' ';
        char[] chars = new char[s.length()+1];
        chars[0]='a';

        for (int i = 1; i <chars.length; i++) {
            chars[i]=s.charAt(i-1);
        }

        for (int i = chars.length-1; i > 0; i--) {
               c=chars[i];
               before = chars[i-1];
            switch (c) {
                case 'I':
                num++;
                break;

                case 'V':
                num = num+5;
                if(before=='I'){
                    num=num-2;
                }
                break;

                case 'X':
                num = num+10;
                if(before=='I'){
                    num=num-2;
                }
                break;

                case 'L':
                num = num+50;
                if(before=='X'){
                    num=num-20;
                }
                break;

                case 'C':
                num = num+100;
                if(before=='X'){
                    num=num-20;
                }
                break;

                case 'D':
                num = num+500;
                if(before=='C'){
                    num=num-200;
                }
                break;

                case 'M':
                num = num+1000;
                if(before=='C'){
                    num=num-200;
                }
                break;

                case 'a':
                break;
           }
         } 

        return num;
    }

    /*
        Roman numerals are represented by seven different symbols: 
        I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9. 
        X can be placed before L (50) and C (100) to make 40 and 90. 
        C can be placed before D (500) and M (1000) to make 400 and 900.
        Given a roman numeral, convert it to an integer.

        Example 1:

        Input: s = "III"
        Output: 3
        Explanation: III = 3.

        Example 2:
        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.

        Example 3:
        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4. */
}