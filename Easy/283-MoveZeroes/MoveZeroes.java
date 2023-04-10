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
}