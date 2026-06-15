package leetcode.editor.cn.array;
class P896MonotonicArray{
    public static void main(String[] args){
        Solution solution = new P896MonotonicArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 2){
            return true;
        }
        boolean add = true;
        boolean jian = true;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i+1]){
                add = false;
                break;
            }
        }
        for(int i = 0; i < n - 1; i++){
            if(nums[i] < nums[i+1]){
                jian = false;
                break;
            }
        }
        return add || jian;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}