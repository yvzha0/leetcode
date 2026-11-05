package leetcode.editor.cn.Dynamic;
class P1049LastStoneWeightIi{
    public static void main(String[] args){
        Solution solution = new P1049LastStoneWeightIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int stone : stones){
            sum += stone;
        }
        int m = stones.length;
        int n = sum / 2;
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = dp[i - 1][j];
                if(j >= stones[i - 1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - stones[i - 1]] + stones[i - 1]);
                }
            }
        }
        return sum - 2 * dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}