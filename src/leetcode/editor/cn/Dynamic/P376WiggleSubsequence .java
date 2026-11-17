package leetcode.editor.cn.Dynamic;

import java.util.Arrays;

class P376WiggleSubsequence{
    public static void main(String[] args){
        Solution solution = new P376WiggleSubsequence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int wiggleMaxLength(int[] nums) {
//        int n = nums.length;
//        //0 上升 1 下降
//        int[][] dp = new int[n][2];
//        for(int i = 0; i < n; i++){
//            dp[i][0] = 1;
//            dp[i][1] = 1;
//        }
//        int ans = 1;
//        for(int i = 1; i < n; i++){
//            for(int j = i - 1; j >= 0; j--){
//                if(nums[i] > nums[j]){
//                    dp[i][0] = Math.max(dp[i][0], dp[j][1] + 1);
//                } else if (nums[i] < nums[j]) {
//                    dp[i][1] = Math.max(dp[i][1], dp[j][0] + 1);
//                }
//            }
//            ans = Math.max(ans, Math.max(dp[i][0], dp[i][1]));
//        }
//        return ans;
//    }

    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int[] up = new int[n];
        int[] down = new int[n];
        Arrays.fill(up, 1);
        Arrays.fill(down, 1);
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                up[i] = Math.max(up[i - 1], down[i - 1] + 1);
                down[i] = down[i - 1];
            }else if(nums[i] < nums[i - 1]){
                down[i] = Math.max(down[i - 1], up[i - 1] + 1);
                up[i] = up[i - 1];
            }else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[n - 1], down[n - 1]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}