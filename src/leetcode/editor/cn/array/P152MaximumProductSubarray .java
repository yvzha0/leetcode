package leetcode.editor.cn.array;
class P152MaximumProductSubarray{
    public static void main(String[] args){
        Solution solution = new P152MaximumProductSubarray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dpMax = new int[n];
        int[] dpMin = new int[n];
        dpMax[0] = nums[0];
        dpMin[0] = nums[0];
        int ans = dpMax[0];
        for(int i = 1; i < n; i++){
            dpMax[i] = Math.max(nums[i], Math.max(dpMax[i - 1] * nums[i], dpMin[i - 1] * nums[i]));
            dpMin[i] = Math.min(nums[i], Math.min(dpMax[i - 1] * nums[i], dpMin[i - 1] * nums[i]));
            ans = Math.max(ans, dpMax[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}