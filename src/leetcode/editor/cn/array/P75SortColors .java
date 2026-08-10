package leetcode.editor.cn.array;
class P75SortColors{
    public static void main(String[] args){
        Solution solution = new P75SortColors().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        for(int i = 0; i <= r; i++){
            while(i <= r && nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}