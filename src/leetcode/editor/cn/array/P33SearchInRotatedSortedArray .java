package leetcode.editor.cn.array;
class P33SearchInRotatedSortedArray{
    public static void main(String[] args){
        Solution solution = new P33SearchInRotatedSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(target == nums[n - 1]){
            return n - 1;
        }
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[n - 1]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        if(target > nums[n - 1]){
            return binarySearch(nums, target, 0, l - 1);
        }
        return binarySearch(nums, target, l, n - 1);
    }

    private int binarySearch(int[] nums, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > target){
                r = mid - 1;
            }else if(nums[mid] == target){
                return mid;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}