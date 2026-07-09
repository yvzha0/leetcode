package leetcode.editor.cn.array;

class P674LongestContinuousIncreasingSubsequence{
    public static void main(String[] args){
        Solution solution = new P674LongestContinuousIncreasingSubsequence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 1;
        int n = nums.length;
        int l = 0;
        int r = 1;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] < nums[r]){
                r++;
                ans = Math.max(ans, r - l);
            }else {
                l = r;
                r++;
            }
        }
        return ans;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}