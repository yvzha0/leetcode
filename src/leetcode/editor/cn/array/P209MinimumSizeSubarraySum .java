package leetcode.editor.cn.array;
class P209MinimumSizeSubarraySum{
    public static void main(String[] args){
        Solution solution = new P209MinimumSizeSubarraySum().new Solution();
        solution.minSubArrayLen(7, new int[] {2,3,1,2,4,3});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];
            while(sum >= target){
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}