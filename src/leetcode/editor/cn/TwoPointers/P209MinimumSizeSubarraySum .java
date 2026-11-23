package leetcode.editor.cn.TwoPointers;
class P209MinimumSizeSubarraySum{
    public static void main(String[] args){
        Solution solution = new P209MinimumSizeSubarraySum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int r = 0; r < n; r++){
            sum += nums[r];
            while(sum >= target){
                sum -= nums[l];
                l++;
                ans = Math.min(ans, r - l + 2);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}