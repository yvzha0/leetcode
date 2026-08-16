package leetcode.editor.cn.array;
class P26RemoveDuplicatesFromSortedArray{
    public static void main(String[] args){
        Solution solution = new P26RemoveDuplicatesFromSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1;
        int n = nums.length;
        for(int r = 1; r < n; r++){
            if(nums[r] != nums[r - 1]){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}