package leetcode.editor.cn.Dynamic;
class P1641CountSortedVowelStrings{
    public static void main(String[] args){
        Solution solution = new P1641CountSortedVowelStrings().new Solution();
        solution.countVowelStrings(2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][5];
        for(int i = 0; i < 5; i++){
            dp[1][i] = 1;
        }
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < 5; j++){
                for(int k = j; k < 5; k++){
                    dp[i][j] += dp[i - 1][k];
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < 5; i++){
            ans += dp[n][i];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}