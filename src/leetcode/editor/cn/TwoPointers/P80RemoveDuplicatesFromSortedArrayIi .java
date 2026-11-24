package leetcode.editor.cn.TwoPointers;
class P80RemoveDuplicatesFromSortedArrayIi{
    public static void main(String[] args){
        Solution solution = new P80RemoveDuplicatesFromSortedArrayIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1;
        int n = nums.length;
        int count = 1;
        for(int r = 1; r < n; r++){
            nums[l] = nums[r];
            if(nums[l] == nums[l - 1]){
                if(count < 2){
                    count++;
                    l++;
                }
            }else {
                count = 1;
                l++;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}