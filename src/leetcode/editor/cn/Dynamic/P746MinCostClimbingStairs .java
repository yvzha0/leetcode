package leetcode.editor.cn.Dynamic;
class P746MinCostClimbingStairs{
    public static void main(String[] args){
        Solution solution = new P746MinCostClimbingStairs().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        for(int i = 2; i < n + 1; i++){
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}