package leetcode.editor.cn.array;
class P81SearchInRotatedSortedArrayIi{
    public static void main(String[] args){
        Solution solution = new P81SearchInRotatedSortedArrayIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target || nums[l] == target || nums[r] == target){
                return true;
            }
            if(nums[l] == nums[mid] && nums[r] == nums[mid]){
                l++;
                r--;
                continue;
            }
            if(nums[l] <= nums[mid]){
                if(nums[l] < target && nums[mid] > target){
                    r = mid - 1;
                }else {
                    l = mid + 1;
                }
            }else {
                if(nums[mid] < target && nums[r] > target){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}