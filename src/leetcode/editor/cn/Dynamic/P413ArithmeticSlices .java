package leetcode.editor.cn.Dynamic;

class P413ArithmeticSlices{
    public static void main(String[] args){
        Solution solution = new P413ArithmeticSlices().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return 0;
        }
        int[] dp = new int[n];

        int ans = 0;
        for(int i = 2; i < n; i++){
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]){
                if(dp[i - 1] == 0){
                    dp[i] = 1;
                }else {
                    dp[i] = dp[i - 1] + 1;
                }
                ans += dp[i];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}