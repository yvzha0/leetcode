package leetcode.editor.cn;
class P26RemoveDuplicatesFromSortedArray{
    public static void main(String[] args){
        Solution solution = new P26RemoveDuplicatesFromSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int ans = 1;
        int a = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] != a){
                a = nums[i];
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}