package leetcode.editor.cn.Dynamic;
class P343IntegerBreak{
    public static void main(String[] args){
        Solution solution = new P343IntegerBreak().new Solution();
        solution.integerBreak(10);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int integerBreak(int n) {
//        int[][] dp = new int[n + 1][n + 1];
//        int ans = 1;
//        for(int i = 1; i <= n; i++){
//            dp[i][1] = i;
//        }
//        for(int i = 2; i <= n; i++){
//            for(int j = 2; j <= i; j++){
//                for(int k = 1; k <= i - j + 1 ; k++){
//                    dp[i][j] = Math.max(dp[i][j], k * dp[i - k][j - 1]);
//                }
//                ans = Math.max(ans, dp[i][j]);
//            }
//        }
//        return ans;
//    }

//    public int integerBreak(int n) {
//        int[] dp = new int[n + 1];
//        dp[2] = 1;
//        for(int i = 3; i <= n; i++){
//            for(int j = 1; j <= i - 1; j++){
//                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
//            }
//        }
//        return dp[n];
//    }
    public int integerBreak(int n) {
        // dp[i][j]：使用 1~i 的数字，凑成 j 的最大乘积
        int[][] dp = new int[n][n + 1];

        // 凑成 0 时，空乘积定义为 1
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        // 枚举物品：数字 1~n-1
        for (int i = 1; i < n; i++) {
            // 枚举背包容量
            for (int j = 1; j <= n; j++) {
                // 不选择数字 i
                dp[i][j] = dp[i - 1][j];

                // 选择数字 i（可以重复选择）
                if (j >= i) {
                    dp[i][j] = Math.max(
                            dp[i][j],
                            dp[i][j - i] * i
                    );
                }
            }
        }

        return dp[n - 1][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}