import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {

    }
      
    public static int majorityElement(int[] nums) {
        
        Arrays.sort(nums);

        int i = 0;
        int j = 1;

        while(i<nums.length-1){
            
            if(nums[i]==nums[i+1]){
                j++;
                if(j>nums.length/2){
                    return nums[i];
                }
            }else{
                j = 0;
            }
            i++;
        }
        return nums[i];
    }
    /*
        Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        Example 1:
        Input: nums = [3,2,3]
        Output: 3
        
        Example 2:
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
        
        Constraints:
        n == nums.length
        1 <= n <= 5 * 104
        -109 <= nums[i] <= 109
     */
}

