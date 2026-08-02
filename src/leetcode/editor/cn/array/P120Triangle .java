package leetcode.editor.cn.array;

import java.util.List;

class P120Triangle{
    public static void main(String[] args){
        Solution solution = new P120Triangle().new Solution();
        List<List<Integer>> doubleList = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        solution.minimumTotal(doubleList);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = triangle.get(n - 1).get(i);
        }
        for(int i = n - 2; i >= 0; i--){
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}