package leetcode.editor.cn.array;
class P724FindPivotIndex{
    public static void main(String[] args){
        Solution solution = new P724FindPivotIndex().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int n = nums.length;
        int[] preSum = new int[n+1];
        for(int i = 0; i < n; i++){
            preSum[i+1] = preSum[i] + nums[i];
        }
        for(int i = 0; i < n; i++){
            if(preSum[i] == preSum[n] - preSum[i + 1]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}