
public class AddDigits {
    public static void main(String[] args) {
   
    }
   
    public static int addDigits(int num) {
  
        int toplam = 0;

        while(num>9){
            while (num != 0) {
                toplam += num % 10;
                num /= 10;
            }
            num = toplam; 
            toplam = 0;
        }

        return num;
    }
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

    Example 1:
    Input: num = 38
    Output: 2
   
    Explanation: The process is 38 --> 3 + 8 --> 11 --> 1 + 1 --> 2 
    Since 2 has only one digit, return it.
    
    Example 2:
    Input: num = 0
    Output: 0

    Constraints:
    0 <= num <= 231 - 1
    */
}