
public class SubarraySumEqualsK {
    public static void main(String[] args) {

    }  

    public static int subarraySum(int[] nums, int k) {
        int num = 0;
        int sum = 0;

       for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k){
                    num++;
                }
            }
            sum=0;
       }
       return num; 
    } 
    /*
    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Example 1:
    Input: nums = [1,1,1], k = 2
    Output: 2
    
    Example 2:
    Input: nums = [1,2,3], k = 3
    Output: 2

    Constraints:
    1 <= nums.length <= 2 * 104
    -1000 <= nums[i] <= 1000
    -107 <= k <= 107
     */
}
