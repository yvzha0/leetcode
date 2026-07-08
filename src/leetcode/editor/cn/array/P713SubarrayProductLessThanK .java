package leetcode.editor.cn.array;
class P713SubarrayProductLessThanK{
    public static void main(String[] args){
        Solution solution = new P713SubarrayProductLessThanK().new Solution();
        solution.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3}, 19);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int n = nums.length;
        int l = 0;
        int ans = 0;
        int curMul = 1;
        for(int r = 0; r < n; r++){
            curMul *= nums[r];
            while(curMul >= k){
                curMul /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}