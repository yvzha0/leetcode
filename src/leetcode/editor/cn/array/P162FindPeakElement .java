package leetcode.editor.cn.array;

class P162FindPeakElement{
    public static void main(String[] args){
        Solution solution = new P162FindPeakElement().new Solution();
        solution.findPeakElement(new int[]{1,2,3,4,3});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] < nums[mid + 1]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}