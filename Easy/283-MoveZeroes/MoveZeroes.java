public class MoveZeroes {

    public static void main(String[] args) {
       
    }

    public static void moveZeroes(int[] nums) {
        
        int lastNonZeroIndex = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                    nums[lastNonZeroIndex] = nums[i];
                    lastNonZeroIndex++;
            }
        }
        
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.

        Example 1:
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        
        Example 2:
        Input: nums = [0]
        Output: [0]
     */
}