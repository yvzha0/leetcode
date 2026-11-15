package leetcode.editor.cn.Dynamic;
class P416PartitionEqualSubsetSum{
    public static void main(String[] args){
        Solution solution = new P416PartitionEqualSubsetSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0){
            return false;
        }
        int capacity = sum / 2;
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][capacity + 1];
        dp[0][0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= capacity; j++){
                dp[i][j] = dp[i - 1][j];
                if(!dp[i][j] && j >= nums[i - 1]){
                    dp[i][j] = dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[n][capacity];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}