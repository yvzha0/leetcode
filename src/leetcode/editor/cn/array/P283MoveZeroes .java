package leetcode.editor.cn.array;
class P283MoveZeroes{
    public static void main(String[] args){
        Solution solution = new P283MoveZeroes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0;
        for(; l < n; l++){
            if(nums[l] == 0){
                break;
            }
        }
        int r = l + 1;
        for(; r < n; r++){
            if(nums[r] != 0){
                nums[l] = nums[r];
                nums[r] = 0;
            }
            while(nums[l] != 0){
                l++;
            }
        }
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}