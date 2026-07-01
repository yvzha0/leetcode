package leetcode.editor.cn.array;
class P775GlobalAndLocalInversions{
    public static void main(String[] args){
        Solution solution = new P775GlobalAndLocalInversions().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;
        int[] lastMin = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            lastMin[i] = min;
            if(i < n - 2){
                if(nums[i] > lastMin[i + 2]){
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}