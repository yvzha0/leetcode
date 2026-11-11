package leetcode.editor.cn.Dynamic;
class P494TargetSum{
    public static void main(String[] args){
        Solution solution = new P494TargetSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    int ans;
//    public int findTargetSumWays(int[] nums, int target) {
//        ans = 0;
//        dfs(nums, target, 1, 0);
//        dfs(nums, target, -1, 0);
//        return ans;
//    }
//
//    private void dfs(int[] nums, int target, int flag, int idx){
//        target -= nums[idx] * flag;
//        if(idx == nums.length - 1){
//            if(target == 0){
//                ans++;
//            }
//            return;
//        }
//        dfs(nums, target, 1, idx + 1);
//        dfs(nums, target, -1, idx + 1);
//    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if (Math.abs(target) > sum || (sum + target) % 2 != 0) {
            return 0;
        }
        int m = nums.length;
        int n = (sum + target) / 2;
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        for(int i = 1; i <= m; i++){
            for(int j = 0; j <= n; j++){
                // 不选择第 i 个数字
                dp[i][j] = dp[i - 1][j];

                // 选择第 i 个数字
                if (j >= nums[i - 1]) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}