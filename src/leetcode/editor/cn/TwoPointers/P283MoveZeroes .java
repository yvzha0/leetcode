package leetcode.editor.cn.TwoPointers;
class P283MoveZeroes{
    public static void main(String[] args){
        Solution solution = new P283MoveZeroes().new Solution();
        solution.moveZeroes(new int[] {0,1,0,3,12});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}