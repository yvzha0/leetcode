package leetcode.editor.cn.Dynamic;
class P1463CherryPickupIi{
    public static void main(String[] args){
        Solution solution = new P1463CherryPickupIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    dp[m - 1][i][j] = grid[m - 1][i];
                }else {
                    dp[m - 1][i][j] = grid[m - 1][i] + grid[m - 1][j];
                }
            }
        }

        for(int i = m - 2; i >= 0; i--){
            for(int j1 = 0; j1 < n; j1++){
                for(int j2 = 0; j2 < n; j2++){
                    int cherrys;
                    if(j1 == j2){
                        cherrys = grid[i][j1];
                    }else {
                        cherrys = grid[i][j1] + grid[i][j2];
                    }
                    int best = 0;
                    for(int d1 = -1; d1 <= 1; d1++){
                        for(int d2 = -1; d2 <= 1; d2++){
                            int nj1 = j1 + d1;
                            int nj2 = j2 + d2;
                            if(nj1 >= 0 && nj1 < n && nj2 >= 0 && nj2 < n){
                                best = Math.max(best, dp[i + 1][nj1][nj2]);
                            }
                        }
                    }
                    dp[i][j1][j2] = cherrys + best;
                }
            }
        }
        return dp[0][0][n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}