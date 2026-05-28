package leetcode.editor.cn.array;

import java.util.*;

class P1329SortTheMatrixDiagonally{
    public static void main(String[] args){
        Solution solution = new P1329SortTheMatrixDiagonally().new Solution();
        solution.diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}});
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Key: i - j (对角线唯一标识), Value: 小顶堆（自动升序）
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // 1. 把所有元素按对角线分门别类放入对应的小顶堆中
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 如果是新对角线，初始化一个小顶堆
                map.putIfAbsent(i - j, new PriorityQueue<>());
                map.get(i - j).offer(mat[i][j]);
            }
        }

        // 2. 从上到下、从左到右回填矩阵，每次 poll() 出来的必然是该对角线当前最小的数
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }

        return mat;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}