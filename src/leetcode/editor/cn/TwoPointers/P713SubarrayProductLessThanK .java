package leetcode.editor.cn.TwoPointers;
class P713SubarrayProductLessThanK{
    public static void main(String[] args){
        Solution solution = new P713SubarrayProductLessThanK().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int ans = 0;
        int a = 1;
        for(int r = 0; r < n; r++){
            a *= nums[r];
            while(l <= r && a >= k){
                a /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}