package leetcode.editor.cn.array;
class P45JumpGameIi{
    public static void main(String[] args){
        Solution solution = new P45JumpGameIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int end = 0;
        int maxReach = 0;

        for(int i = 0; i < nums.length - 1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);

            if(i == end){
                ans++;
                end = maxReach;

                if(end >= nums.length - 1){
                    break;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}