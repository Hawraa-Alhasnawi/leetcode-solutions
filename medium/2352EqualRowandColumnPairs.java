import java.util.*;
class Solution {
    //Time complexity: O(n^2) where n is the number of rows and columns in the grid

    public int equalPairs(int[][] grid) {
        /*store the elements and each time we store something check if it already exists if it does increment a counter until all elements are reached.
        hashmap to store the frequency of each row
        convert each column into a list to check if it exists in the map*/
        int n = grid.length;
        int pairCount = 0;
        Map<String, Integer> rowMap = new HashMap<>();

        //build each row as a string and store it into a hash map.
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            StringBuilder rowKeyBuilder = new StringBuilder();
            for (int colIndex = 0; colIndex < n; colIndex++) {
                rowKeyBuilder.append(grid[rowIndex][colIndex]).append(",");
            }
            //convert to string
            String rowKey = rowKeyBuilder.toString();
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }
        //build each column as a string and compare it to the hash if seen before increment paircount
        for(int colIndex = 0; colIndex<n; colIndex++){
             StringBuilder colKeyBuilder = new StringBuilder();
             for(int rowIndex=0; rowIndex <n; rowIndex++){
                colKeyBuilder.append(grid[rowIndex][colIndex]).append(",");
            }
            //convert to string
            String colKey = colKeyBuilder.toString();
            //check if column exists within rows
            pairCount += rowMap.getOrDefault(colKey,0);

        }
        return pairCount;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        int[][] grid = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };

        int result = solution.equalPairs(grid);
        System.out.println("Equal row-column pairs: " + result); // Expected: 1
    }
}