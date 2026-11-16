package leetcode.editor.cn.Dynamic;

import java.util.Arrays;

class P410SplitArrayLargestSum{
    public static void main(String[] args){
        Solution solution = new P410SplitArrayLargestSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        // dp[i][j]表示前i个数字中分成j组，各自和的最大值的最小值
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k; j++){
                for(int p = j - 1; p < i; p++){
                    int lastSum = prefix[i] - prefix[p];
                    int max = Math.max(dp[p][j - 1], lastSum);
                    dp[i][j] = Math.min(dp[i][j], max);
                }
            }
        }
        return dp[n][k];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}