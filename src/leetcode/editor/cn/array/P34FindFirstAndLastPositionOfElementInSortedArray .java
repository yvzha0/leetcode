package leetcode.editor.cn.array;

class P34FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args){
        Solution solution = new P34FindFirstAndLastPositionOfElementInSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] ans = new int[] {-1, -1};
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                ans[0] = mid;
            }
            if(nums[mid] >= target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        l = 0;
        r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                ans[1] = mid;
            }
            if(nums[mid] <= target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}