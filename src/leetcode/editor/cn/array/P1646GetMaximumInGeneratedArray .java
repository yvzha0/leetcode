package leetcode.editor.cn.array;
class P1646GetMaximumInGeneratedArray{
    public static void main(String[] args){
        Solution solution = new P1646GetMaximumInGeneratedArray().new Solution();
        solution.getMaximumGenerated(7);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int maxVal = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            maxVal = Math.max(maxVal, nums[i]);
        }

        return maxVal;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}