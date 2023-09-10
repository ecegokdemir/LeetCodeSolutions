import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args) {

    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(firstRow);

        if (rowIndex + 1 > 1) {
            for (int i = 1; i < rowIndex + 1; i++) {

                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);

                List<Integer> previousRow = myList.get(i - 1);
                for (int j = 1; j < i; j++) {
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }

                currentRow.add(1);
                myList.add(currentRow);
            }
        }

        return myList.get(rowIndex);
    }
    /*
    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the
    Pascal's triangle.
    
    Example 1:
    Input: rowIndex = 3
    Output: [1,3,3,1]
   
    Example 2:
    Input: rowIndex = 0
    Output: [1]
    
    Example 3:
    Input: rowIndex = 1
    Output: [1,1]
    
    Constraints:
    0 <= rowIndex <= 33
     */
}
