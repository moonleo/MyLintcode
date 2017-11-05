public class Solution {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(null == matrix || matrix.length == 0) {
            return false;
        }
        // write your code here
        //搜索target所在行
        int rowIndex = searchRow(matrix, 0, matrix.length - 1, target);
        System.out.println("row:"+rowIndex);
        int columnIndex = -1;
        if(rowIndex != -1) {
            if(matrix[rowIndex][0] > target || matrix[rowIndex][matrix[0].length-1] < target) {
                return false;
            }
        //搜索target所在列
            columnIndex = searchColumn(matrix, rowIndex, 0, matrix[0].length - 1, target);
            System.out.println("column:"+columnIndex);
        }
        return columnIndex == -1? false: true;
    }

    //搜索target所在列的索引，没有返回-1
    public int searchRow(int[][] matrix, int start, int end, int target) {
        if(start >= end) {
            return start;
        }
        int mid = (start + end) / 2;
        if(matrix[mid][0] > target || matrix[mid][matrix[0].length-1]>=target) {
            return searchRow(matrix, start, mid - 1, target);
        } else if(matrix[mid][0] == target) {
            return mid;
        } else {
            return searchRow(matrix, mid + 1, end, target);
        }
    }

    public int searchColumn(int[][] matrix, int rowIndex, int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end) / 2;
        if(matrix[rowIndex][mid] == target) {
            return mid;
        } else if(matrix[rowIndex][mid] > target) {
            return searchColumn(matrix, rowIndex, start, mid - 1, target);
        } else {
            return searchColumn(matrix, rowIndex, mid + 1, end, target);
        }
    }
}
