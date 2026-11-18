package leetcode.editor.cn.Dynamic;

import java.util.Arrays;

class P322CoinChange{
    public static void main(String[] args){
        Solution solution = new P322CoinChange().new Solution();
        solution.coinChange(new int[] {2}, 3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length;
        int[][] dp = new int[m + 1][amount + 1];
        for(int[] a : dp){
            Arrays.fill(a, Integer.MAX_VALUE - 1);
        }
        for(int i = 0; i <= m; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= amount; j++){
                dp[i][j] = dp[i - 1][j];
                if(j >= coins[i - 1]){
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - coins[i - 1]] + 1);
                }
            }
        }
        return dp[m][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[m][amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}