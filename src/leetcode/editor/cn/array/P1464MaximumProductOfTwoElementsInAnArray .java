package leetcode.editor.cn.array;

class P1464MaximumProductOfTwoElementsInAnArray{
    public static void main(String[] args){
        Solution solution = new P1464MaximumProductOfTwoElementsInAnArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        int a = Math.max(nums[0], nums[1]);
        int b = Math.min(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(nums[i] > a){
                b = a;
                a = nums[i];
            }else if(nums[i] > b){
                b = nums[i];
            }
        }
        return (a - 1) * (b - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}