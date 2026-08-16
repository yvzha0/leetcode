package leetcode.editor.cn.array;
class P35SearchInsertPosition{
    public static void main(String[] args){
        Solution solution = new P35SearchInsertPosition().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}