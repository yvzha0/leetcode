package leetcode.editor.cn.array;
class P55JumpGame{
    public static void main(String[] args){
        Solution solution = new P55JumpGame().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i <= max){
                max = Math.max(max, i + nums[i]);
                if(max >= n - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}