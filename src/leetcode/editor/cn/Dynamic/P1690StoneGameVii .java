package leetcode.editor.cn.Dynamic;
class P1690StoneGameVii{
    public static void main(String[] args){
        Solution solution = new P1690StoneGameVii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int stoneGameVII(int[] stones) {
        int n = stones.length;

        // 前缀和
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pre[i + 1] = pre[i] + stones[i];
        }

        int[][] dp = new int[n][n];

        // i 从后往前，j 从左往右
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {

                // 移除左边
                int left = pre[j + 1] - pre[i + 1];

                // 移除右边
                int right = pre[j] - pre[i];

                dp[i][j] = Math.max(
                        left - dp[i + 1][j],
                        right - dp[i][j - 1]
                );
            }
        }

        return dp[0][n - 1];
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}