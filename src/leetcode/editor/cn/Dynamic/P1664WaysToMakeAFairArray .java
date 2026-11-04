package leetcode.editor.cn.Dynamic;

class P1664WaysToMakeAFairArray{
    public static void main(String[] args){
        Solution solution = new P1664WaysToMakeAFairArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int waysToMakeFair(int[] nums) {
        int leftOdd = 0;
        int leftEven = 0;
        int rightOdd = 0;
        int rightEven = 0;
        int n = nums.length;
        int ans = 0;
        for(int i = n - 1; i >= 0; i--){
            if(i % 2 == 0){
                rightEven += nums[i];
            }else {
                rightOdd += nums[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                rightEven -= nums[i];
            }else {
                rightOdd -= nums[i];
            }
            if(leftOdd + rightEven == leftEven + rightOdd){
                ans++;
            }
            if(i % 2 == 0){
                leftEven += nums[i];
            }else {
                leftOdd += nums[i];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}