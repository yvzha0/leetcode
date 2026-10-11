package leetcode.editor.cn.TwoPointers;
class P977SquaresOfASortedArray{
    public static void main(String[] args){
        Solution solution = new P977SquaresOfASortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0;
        int r = n - 1;
        int index = n - 1;
        while(l <= r){
            int a = nums[l] * nums[l];
            int b = nums[r] * nums[r];
            if(a > b){
                ans[index--] = a;
                l++;
            }else {
                ans[index--] = b;
                r--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}