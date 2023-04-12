
public class ShuffletheArray {

    public static void main(String[] args) {

         int[] arr = {0,1,2,3,4,5};
       for (Integer num : shuffle(arr,3)) {
        System.out.print(num);
       }
       //2,3,5,4,1,7
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] myArr = new int[2*n];
        int j = 0;

        for (int i = 0; i < 2*n; i=i+2) {
            myArr[i]=nums[j];
            j++;
        }

        for (int i = 1; i < 2*n; i=i+2) {
            myArr[i]=nums[j];
            j++;
        }

       return myArr;
    }
}