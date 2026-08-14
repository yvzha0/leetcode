package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P54SpiralMatrix{
    public static void main(String[] args){
        Solution solution = new P54SpiralMatrix().new Solution();
        solution.spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        fill(ans, matrix, 0, 0, m, n);
        return ans;
    }

    private void fill(List<Integer> ans, int[][] matrix, int i, int j, int m, int n){
        if(m <= 0 || n <= 0){
            return;
        }
        if(m == 1){
            for(int a = j; a < j + n; a++){
                ans.add(matrix[i][a]);
            }
            return;
        }
        if(n == 1){
            for(int a = i; a < i + m; a++){
                ans.add(matrix[a][j]);
            }
            return;
        }
        for(int a = j; a < j + n; a++){
            ans.add(matrix[i][a]);
        }
        for(int a = i + 1; a < i + m; a++){
            ans.add(matrix[a][j + n - 1]);
        }
        for(int a = j + n - 2; a >= j; a--){
            ans.add(matrix[i + m - 1][a]);
        }
        for(int a = i + m - 2; a > i; a--){
            ans.add(matrix[a][j]);
        }
        fill(ans, matrix, i + 1, j + 1, m - 2, n - 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}