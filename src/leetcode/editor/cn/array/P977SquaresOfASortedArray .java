package leetcode.editor.cn.array;
class P977SquaresOfASortedArray{
    public static void main(String[] args){
        Solution solution = new P977SquaresOfASortedArray().new Solution();
        solution.sortedSquares(new int[]{-5,-3,-2,-1});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int pos = n;
        for(int i = 0; i < n;i++){
            if(nums[i] >= 0){
                pos = i;
                break;
            }
        }
        int neg = pos - 1;
        int[] ans = new int[n];
        for(int i = 0; i < n;i++){
            if(neg >= 0 && pos < n){
                int a = nums[neg] * nums[neg];
                int b = nums[pos] * nums[pos];
                if(a < b){
                    ans[i] = a;
                    neg--;
                }else {
                    ans[i] = b;
                    pos++;
                }
            }else if(neg >= 0){
                int a = nums[neg] * nums[neg];
                ans[i] = a;
                neg--;
            }else {
                int b = nums[pos] * nums[pos];
                ans[i] = b;
                pos++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}