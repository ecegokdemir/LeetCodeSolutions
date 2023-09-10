import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<List<Integer>> myList = new ArrayList<>();
        myList.add(firstRow);

        if (numRows > 1) {
            for (int i = 1; i < numRows; i++) {

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

        return myList;
    }

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.

    Example 1:
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    
    Example 2:
    Input: numRows = 1
    Output: [[1]]

    Constraints:
    1 <= numRows <= 30
     */
}
