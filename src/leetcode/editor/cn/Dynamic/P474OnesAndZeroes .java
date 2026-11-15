package leetcode.editor.cn.Dynamic;
class P474OnesAndZeroes{
    public static void main(String[] args){
        Solution solution = new P474OnesAndZeroes().new Solution();
        solution.findMaxForm(new String[] {"10", "1", "0"}, 1, 1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int t = strs.length;
        int[][][] dp = new int[t + 1][m + 1][n + 1];
        for(int i = 1; i <= t; i++){
            int[] a = count(strs[i - 1]);
            for(int j = 0; j <= m; j++){
                for(int k = 0; k <= n; k++){
                    dp[i][j][k] = dp[i - 1][j][k];
                    if(a[0] <= j && a[1] <= k){
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - a[0]][k - a[1]] + 1);
                    }
                }
            }
        }
        return dp[t][m][n];
    }

    private int[] count(String s){
        int[] res = new int[2];
        for(char c : s.toCharArray()){
            res[c - '0']++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}