package leetcode.editor.cn.array;
class P643MaximumAverageSubarrayI{
    public static void main(String[] args){
        Solution solution = new P643MaximumAverageSubarrayI().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k ;i++){
            sum += nums[i];
        }
        int max = sum;
        for(int i = k; i < n; i++){
            sum += nums[i];
            sum -= nums[i-k];
            max = Math.max(sum, max);
        }
        return max * 1.0 / k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}