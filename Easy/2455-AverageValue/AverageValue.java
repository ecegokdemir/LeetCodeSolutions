
public class AverageValue {
    public static void main(String[] args) {
        
    }
    public static int averageValue(int[] nums) {
        int toplam = 0;
        int count = 0;

        for (int i : nums) {
            if(i%6==0){
                toplam+=i;
                count++;
            }
        }
        if(count==0){
            return 0;
        }

        return toplam/count;
    }
    /*
    Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
    Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.

    Example 1:
    Input: nums = [1,3,6,10,12,15]
    Output: 9
    Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
    
    Example 2:
    Input: nums = [1,2,4,7,10]
    Output: 0
    Explanation: There is no single number that satisfies the requirement, so return 0.
     */
}
