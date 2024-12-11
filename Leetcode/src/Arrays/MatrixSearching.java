package Day3;

public class MatrixSearching {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 19;
        System.out.println(Search(matrix, target));
    }

    public static boolean Search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int len = rows * cols;
        int start = 0;
        int end = len - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            int m = mid / cols;
            int n = mid % cols;
            if (matrix[m][n] < target)
            {
                start = mid + 1;
            }
            else if (matrix[m][n] > target)
            {
                end = mid - 1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
