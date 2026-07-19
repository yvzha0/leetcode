package leetcode.editor.cn.array;

class P268MissingNumber{
    public static void main(String[] args){
        Solution solution = new P268MissingNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int n = nums.length;
        return n * (n + 1) / 2 - sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}