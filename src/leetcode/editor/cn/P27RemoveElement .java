package leetcode.editor.cn;
class P27RemoveElement{
    public static void main(String[] args){
        Solution solution = new P27RemoveElement().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}