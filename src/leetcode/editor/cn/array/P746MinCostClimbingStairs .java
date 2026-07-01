package leetcode.editor.cn.array;

class P746MinCostClimbingStairs{
    public static void main(String[] args){
        Solution solution = new P746MinCostClimbingStairs().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i <= n; i++){
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}