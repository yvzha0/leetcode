package leetcode.editor.cn.array;

class P665NonDecreasingArray{
    public static void main(String[] args){
        Solution solution = new P665NonDecreasingArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                if(i == 0 || nums[i - 1] <= nums[i + 1]){
                    count++;
                }else if(i + 1 == n - 1 || nums[i] <= nums[i + 2]){
                    count++;
                }else {
                    return false;
                }
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}