import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
      
    }
    public static boolean containsDuplicate(int[] nums) {
           
        if(nums.length==1){
            return false;
        }

        Set<Integer> MySet = new HashSet<>();

        for (Integer num : nums) {
            MySet.add(num);
        }
        
        return MySet.size() != nums.length;
    }

    /*
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:
        Input: nums = [1,2,3,1]
        Output: true

        Example 2:
        Input: nums = [1,2,3,4]
        Output: false

        Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
     */
}