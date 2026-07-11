package leetcode.editor.cn.array;
class P581ShortestUnsortedContinuousSubarray{
    public static void main(String[] args){
        Solution solution = new P581ShortestUnsortedContinuousSubarray().new Solution();
        solution.findUnsortedSubarray(new int[]{2,6,4,8,16,9,15});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                break;
            }
        }
        int j = n - 1;
        for(; j > 0; j--){
            if(nums[j] < nums[j - 1]){
                break;
            }
        }
        if(i == n - 1 && j == 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int k = i; k <= j; k++){
            min = Math.min(min, nums[k]);
            max = Math.max(max, nums[k]);
        }
        while(i >= 0 && min < nums[i]){
            i--;
        }
        while(j < n && max > nums[j]){
            j++;
        }
        return j - i - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}