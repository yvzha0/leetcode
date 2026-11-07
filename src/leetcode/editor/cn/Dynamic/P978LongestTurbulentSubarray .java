package leetcode.editor.cn.Dynamic;
class P978LongestTurbulentSubarray{
    public static void main(String[] args){
        Solution solution = new P978LongestTurbulentSubarray().new Solution();
        solution.maxTurbulenceSize(new int[] {9,4,2,10,7,8,8,1,9});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        //0: 上升 1:下降
        int n = arr.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        int ans = 1;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] < arr[i]){
                dp[i][0] = dp[i - 1][1] + 1;
            }else {
                dp[i][0] = 1;
            }
            if(arr[i - 1] > arr[i]){
                dp[i][1] = dp[i - 1][0] + 1;
            }else {
                dp[i][1] = 1;
            }
            ans = Math.max(ans,Math.max(dp[i][0], dp[i][1]));
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}