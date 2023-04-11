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
}