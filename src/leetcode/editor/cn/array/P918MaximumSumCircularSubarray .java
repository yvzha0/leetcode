package leetcode.editor.cn.array;
class P918MaximumSumCircularSubarray{
    public static void main(String[] args){
        Solution solution = new P918MaximumSumCircularSubarray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int maxSubarraySumCircular(int[] nums) {
//        int n = nums.length;
//        int preMax = nums[0];
//        int preMin = nums[0];
//        int max = nums[0];
//        int min = nums[0];
//        int sum = nums[0];
//        for(int i = 1; i < n; i++){
//            preMax = Math.max(preMax + nums[i], nums[i]);
//            preMin = Math.min(preMin + nums[i], nums[i]);
//            min = Math.min(min, preMin);
//            max = Math.max(max, preMax);
//            sum += nums[i];
//        }
//        if(max < 0){
//            return max;
//        }
//        return Math.max(max, sum - min);
//    }
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int preMax = nums[0];
        int ans = nums[0];
        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        int leftSum = nums[0];
        for(int i = 1; i < n; i++){
            preMax = Math.max(preMax + nums[i], nums[i]);
            ans = Math.max(ans, preMax);
            leftSum += nums[i];
            leftMax[i] = Math.max(leftMax[i - 1], leftSum);
        }

        int rightSum = 0;
        for(int i = n - 1; i > 0; i--){
            rightSum += nums[i];
            ans = Math.max(ans, rightSum + leftMax[i - 1]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}