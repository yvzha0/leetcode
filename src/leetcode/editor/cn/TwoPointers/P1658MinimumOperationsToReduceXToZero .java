package leetcode.editor.cn.TwoPointers;

class P1658MinimumOperationsToReduceXToZero{
    public static void main(String[] args){
        Solution solution = new P1658MinimumOperationsToReduceXToZero().new Solution();
        solution.minOperations(new int[] {3,2,20,1,1,3}, 10);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int n = nums.length;
        for(int num : nums){
            sum += num;
        }
        int target = sum - x;
        if(target < 0){
            return -1;
        }
        if(target == 0){
            return n;
        }
        int ans = n;
        sum = 0;
        int l = 0;
        for(int r = 0; r < n; r++){
            sum += nums[r];
            while(sum > target){
                sum -= nums[l];
                l++;
            }
            if(sum == target){
                ans = Math.min(ans, n - (r - l + 1));
            }
        }

        return ans == n ? -1 : ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}