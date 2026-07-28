package leetcode.editor.cn.array;
class P153FindMinimumInRotatedSortedArray{
    public static void main(String[] args){
        Solution solution = new P153FindMinimumInRotatedSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] < nums[r]){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}