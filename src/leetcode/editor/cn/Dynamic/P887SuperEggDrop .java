package leetcode.editor.cn.Dynamic;
class P887SuperEggDrop{
    public static void main(String[] args){
        Solution solution = new P887SuperEggDrop().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int superEggDrop(int k, int n) {
        // dp[i][j]：扔 i 次，有 j 个鸡蛋，最多能确定多少层楼
        int[][] dp = new int[n + 1][k + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k; j++){
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j] + 1;
            }
            if(dp[i][k] >= n){
                return i;
            }
        }
        return n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}