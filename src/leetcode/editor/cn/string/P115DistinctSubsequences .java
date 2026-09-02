package leetcode.editor.cn.string;
class P115DistinctSubsequences{
    public static void main(String[] args){
        Solution solution = new P115DistinctSubsequences().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n && j <= i; j++){
                if(s.charAt(i - 1) == t.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}