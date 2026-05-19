package leetcode.editor.cn.array;
class P1480RunningSumOf1dArray{
    public static void main(String[] args){
        Solution solution = new P1480RunningSumOf1dArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}