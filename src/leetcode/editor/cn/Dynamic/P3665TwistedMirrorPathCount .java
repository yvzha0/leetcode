package leetcode.editor.cn.Dynamic;
class P3665TwistedMirrorPathCount{
    public static void main(String[] args){
        Solution solution = new P3665TwistedMirrorPathCount().new Solution();
        solution.uniquePaths(new int[][]{
                {0,1,0},
                {0,0,1},
                {1,0,0}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1000000007;
        int[][][] dp = new int[m][n][2];
        for(int i = 0; i < m; i++){
            dp[i][0][1] = 1;
            if(grid[i][0] == 1){
                break;
            }
        }
        for(int j = 0; j < n; j++){
            dp[0][j][0] = 1;
            if(grid[0][j] == 1){
                break;
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(grid[i - 1][j] == 0){
                    dp[i][j][1] = (dp[i - 1][j][0] + dp[i - 1][j][1]) % mod;
                }else {
                    dp[i][j][1] = dp[i - 1][j][0] % mod;
                }

                if(grid[i][j - 1] == 0){
                    dp[i][j][0] = (dp[i][j - 1][0] + dp[i][j - 1][1]) % mod;
                }else {
                    dp[i][j][0] = dp[i][j - 1][1] % mod;
                }
            }
        }
        return (dp[m - 1][n - 1][0] + dp[m - 1][n - 1][1]) % mod;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}