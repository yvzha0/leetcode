package leetcode.editor.cn.array;

import java.util.Arrays;

class P891SumOfSubsequenceWidths{
    public static void main(String[] args){
        Solution solution = new P891SumOfSubsequenceWidths().new Solution();
        solution.sumSubseqWidths(new int[] {10,4,2,10,9,3,2});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumSubseqWidths(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 0;
        int mod = 1000000007;
        long[] pow2 = new long[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }
        for(int i = 0; i < n; i++){
            ans = (ans + nums[i] * pow2[i] - nums[i] * pow2[n - i - 1]) % mod;
        }
        return (int) ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}