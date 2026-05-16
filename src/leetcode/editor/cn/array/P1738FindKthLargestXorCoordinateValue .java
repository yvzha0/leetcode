package leetcode.editor.cn.array;

import java.util.Arrays;

class P1738FindKthLargestXorCoordinateValue{
    public static void main(String[] args){
        Solution solution = new P1738FindKthLargestXorCoordinateValue().new Solution();
        int[][] a = new int[2][2];
        a[0][0] = 5;
        a[0][1] = 2;
        a[1][0] = 1;
        a[1][1] = 6;
        solution.kthLargestValue(a,1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] results = new int[m * n];
        int idx = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {

                } else if (i == 0) {
                    matrix[i][j] = matrix[i][j - 1] ^ matrix[i][j];
                } else if (j == 0) {
                    matrix[i][j] = matrix[i - 1][j] ^ matrix[i][j];
                } else {
                    matrix[i][j] = matrix[i - 1][j] ^ matrix[i][j - 1] ^ matrix[i - 1][j - 1] ^ matrix[i][j];
                }
                results[idx++] = matrix[i][j];
            }
        }

        Arrays.sort(results);

        return results[results.length - k];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}