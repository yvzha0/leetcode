package leetcode.editor.cn.Dynamic;
class P1524NumberOfSubArraysWithOddSum{
    public static void main(String[] args){
        Solution solution = new P1524NumberOfSubArraysWithOddSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int ans = 0;
        int n = arr.length;
        int[] dp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            if(arr[i - 1] % 2 != 0){
                dp[i] = i - dp[i - 1];
            }else {
                dp[i] = dp[i - 1];
            }
            ans = (ans + dp[i]) % mod;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}