package leetcode.editor.cn.string;
class P583DeleteOperationForTwoStrings{
    public static void main(String[] args){
        Solution solution = new P583DeleteOperationForTwoStrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int minDistance(String word1, String word2) {
//        int m = word1.length();
//        int n = word2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for(int i = 1; i <= m; i++){
//            for(int j = 1; j <= n; j++){
//                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                }else {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        int max = dp[m][n];
//        return m - max + n - max;
//    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j <= n; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}