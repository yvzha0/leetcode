package leetcode.editor.cn.Dynamic;

class P920NumberOfMusicPlaylists{
    public static void main(String[] args){
        Solution solution = new P920NumberOfMusicPlaylists().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        // dp[i][j] 表示列表长度为i，j首不同的歌的列表数量
        long[][] dp = new long[goal + 1][n + 1];
        dp[0][0] = 1;
        int mod = 1000000007;
        for(int i = 1; i <= goal; i++){
            for(int j = 1; j <= Math.min(i, n); j++){
                dp[i][j] += dp[i - 1][j - 1] * (n - j + 1) % mod;
                if(j > k){
                    dp[i][j] += dp[i - 1][j] * (j - k) % mod;
                }
                dp[i][j] %= mod;
            }
        }
        return Math.toIntExact(dp[goal][n]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}