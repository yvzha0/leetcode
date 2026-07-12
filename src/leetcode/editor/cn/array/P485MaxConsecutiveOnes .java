package leetcode.editor.cn.array;
class P485MaxConsecutiveOnes{
    public static void main(String[] args){
        Solution solution = new P485MaxConsecutiveOnes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int n : nums){
            if (n == 1){
                count++;
            }else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}