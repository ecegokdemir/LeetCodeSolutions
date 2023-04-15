import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
   
    }

    public static int singleNumber(int[] nums) {

        if(nums.length==0){
            return nums[0];
        }

        Arrays.sort(nums);

        if( nums[0] != nums[1]){
            return nums[0];
        }

        for (int i = 1; i < nums.length-1; i++) {
            if( nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
    /*
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Example 1:
        Input: nums = [2,2,1]
        Output: 1
       
        Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4
        
        Example 3:
        Input: nums = [1]
        Output: 1
     */
}
