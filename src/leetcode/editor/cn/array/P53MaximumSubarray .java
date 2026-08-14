package leetcode.editor.cn.array;
class P53MaximumSubarray{
    public static void main(String[] args){
        Solution solution = new P53MaximumSubarray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int a = nums[0];
        int ans = a;
        for(int i = 1; i < n; i++){
            a = a < 0 ? nums[i] : a + nums[i];
            ans = Math.max(ans, a);
        }
        return ans;
    }

//    public int maxSubArray(int[] nums) {
//        int min = 0;
//        int ans = Integer.MIN_VALUE;
//        int sum = 0;
//        for(int num : nums){
//            sum += num;
//            ans = Math.max(sum - min, ans);
//            min = Math.min(sum, min);
//        }
//        return ans;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}