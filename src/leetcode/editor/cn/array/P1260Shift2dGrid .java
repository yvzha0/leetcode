package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1260Shift2dGrid{
    public static void main(String[] args){
        Solution solution = new P1260Shift2dGrid().new Solution();
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        solution.shiftGrid(grid, 1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;

        // 步骤 1：预处理 k，防止无意义的越界循环
        k = k % total;

        // 步骤 2：创建临时二维数组用于直接映射赋值
        int[][] temp = new int[m][n];

        // 步骤 3：遍历原网格
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 步骤 4：一维化核心变换
                int index = i * n + j;                     // 二维转一维
                int newIndex = (index + k) % total;         // 一维空间位移
                int newRow = newIndex / n;                  // 一维转二维行坐标
                int newCol = newIndex % n;                  // 一维转二维列坐标

                // 步骤 5：写入临时数组
                temp[newRow][newCol] = grid[i][j];
            }
        }

        // 步骤 6：将二维数组包装为 List<List<Integer>> 结构返回
        List<List<Integer>> ans = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                row.add(temp[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}