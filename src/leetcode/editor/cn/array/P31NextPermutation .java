package leetcode.editor.cn.array;
class P31NextPermutation{
    public static void main(String[] args){
        Solution solution = new P31NextPermutation().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first decreasing point from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the last number that is larger than nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Step 4: Reverse from i + 1 to the end of the array
        reverse(nums, i + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}