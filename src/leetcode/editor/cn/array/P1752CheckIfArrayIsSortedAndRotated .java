package leetcode.editor.cn.array;
class P1752CheckIfArrayIsSortedAndRotated{
    public static void main(String[] args){
        Solution solution = new P1752CheckIfArrayIsSortedAndRotated().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean flag = true;
        for(int i = 0;i < n - 1;i++){
            if(nums[i] > nums[i+1]){
                if(flag){
                    flag = false;
                }else {
                    return false;
                }
            }
        }
        return nums[n-1] <= nums[0] || flag;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}