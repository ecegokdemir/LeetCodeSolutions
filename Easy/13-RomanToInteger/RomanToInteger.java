
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        /* 
            Symbol       Value
            I             1
            V             5
            X             10
            L             50
            C             100
            D             500
            M             1000
        */
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
}