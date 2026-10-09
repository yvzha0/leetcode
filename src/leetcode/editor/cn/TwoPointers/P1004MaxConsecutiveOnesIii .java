package leetcode.editor.cn.TwoPointers;
class P1004MaxConsecutiveOnesIii{
    public static void main(String[] args){
        Solution solution = new P1004MaxConsecutiveOnesIii().new Solution();
        solution.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int l = 0;
        int n = nums.length;
        int zeroCount = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[l] == 0){
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}