package leetcode.editor.cn.array;

class P41FirstMissingPositive{
    public static void main(String[] args){
        Solution solution = new P41FirstMissingPositive().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0){
                nums[i] = n + 1;
            }
        }

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);
            if(val >= 1 && val <= n){
                nums[val - 1] = - Math.abs(nums[val - 1]);
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return n + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}