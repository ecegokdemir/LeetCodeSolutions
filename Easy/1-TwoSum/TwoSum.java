
public class TwoSum {

    public static void main(String[] args) {
        int[] nums= {15,11,2,7};
        System.out.println(twoSum(nums,9));
        
    }

    public static int[] twoSum(int[] nums, int target) {

     for (int i = 0; i < (nums.length-1) ; i++) {
        for (int j = i+1; j < (nums.length) ; j++) {
            if(nums[i]+nums[j] == target){
                int[] numbers = {i,j};   
                return numbers;
            }
        }
     }
     return nums;
    }
}

