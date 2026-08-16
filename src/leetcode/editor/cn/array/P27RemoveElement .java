package leetcode.editor.cn.array;
class P27RemoveElement{
    public static void main(String[] args){
        Solution solution = new P27RemoveElement().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++){
            if(nums[r] != val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}