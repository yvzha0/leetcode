package leetcode.editor.cn.array;
class P795NumberOfSubarraysWithBoundedMaximum{
    public static void main(String[] args){
        Solution solution = new P795NumberOfSubarraysWithBoundedMaximum().new Solution();
        solution.numSubarrayBoundedMax(new int[]{876,880,482,260,132,421,732,703,795,420,871,445,400,291,358,589,617,202,755,810,227,813,549,791,418,528,835,401,526,584,873,662,13,314,988,101,299,816,833,224,160,852,179,769,646,558,661,808,651,982,878,918,406,551,467,87,139,387,16,531,307,389,939,551,613,36,528,460,404,314,66,111,458,531,944,461,951,419,82,896,467,353,704,905,705,760,61,422,395,298,127,516,153,299,801,341,668,598,98,241}, 658, 719);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
//        int ans = 0;
//        // 初始值设为 -1，表示在数组开始前有一个虚拟的“破坏点”和“有效点”
//        // 这样计算长度时 (validIdx - breakIdx) 刚好是正确的个数
//        int breakIdx = -1;
//        int validIdx = -1;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > right) {
//                // 遇到超大的，更新破坏边界
//                breakIdx = i;
//            } else if (nums[i] >= left) {
//                // 遇到合法的，更新有效边界
//                validIdx = i;
//            }
//            // 如果 nums[i] < left，两个指针都不动
//
//            // 只要有效边界在破坏边界右侧，说明存在合法的起点
//            if (validIdx > breakIdx) {
//                ans += validIdx - breakIdx;
//            }
//        }
//        return ans;
//    }

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    private int count(int[] nums, int target){
        int res = 0;
        int cur = 0;
        for(int num : nums){
            cur = num <= target ? cur + 1 : 0;
            res += cur;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}