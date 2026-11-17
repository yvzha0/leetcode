package leetcode.editor.cn.Dynamic;
class P377CombinationSumIv{
    public static void main(String[] args){
        Solution solution = new P377CombinationSumIv().new Solution();
        solution.combinationSum4(new int[] {1,2,3}, 4);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        // dp[j]：凑成总和为 j 的不同排列的数量
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int j = 1; j <= target; j++){
            for(int num : nums){
                if(j >= num){
                    dp[j] += dp[j - num];
                }
            }
        }
        return dp[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}