
public class Pow {

    public static void main(String[] args) {
        
    }

    public static double myPow(double x, int n) {
        
        if (n == 0) {
            return 1.0;
        }

        long power = n;
        if (n < 0) {
            x = 1.0 / x;
            power = -power;
        }

        double result = 1.0;
           
        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }
        return result;
    }

    /*
        Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

        Example 1:
        Input: x = 2.00000, n = 10
        Output: 1024.00000
        
        Example 2:
        Input: x = 2.10000, n = 3
        Output: 9.26100
        
        Example 3:
        Input: x = 2.00000, n = -2
        Output: 0.25000
        Explanation: 2-2 = 1/22 = 1/4 = 0.25
     */
}