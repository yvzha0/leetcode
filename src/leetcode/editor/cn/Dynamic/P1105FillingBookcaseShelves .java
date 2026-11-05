package leetcode.editor.cn.Dynamic;

import java.util.Arrays;

class P1105FillingBookcaseShelves{
    public static void main(String[] args){
        Solution solution = new P1105FillingBookcaseShelves().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            int curWidth = 0;
            int maxHigh = 0;
            for(int j = i - 1; j >= 0; j--){
                curWidth += books[j][0];
                if(curWidth > shelfWidth){
                    break;
                }
                maxHigh = Math.max(maxHigh, books[j][1]);
                dp[i] = Math.min(dp[i], maxHigh + dp[j]);
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}