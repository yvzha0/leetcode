package leetcode.editor.cn.array;
class P978LongestTurbulentSubarray{
    public static void main(String[] args){
        Solution solution = new P978LongestTurbulentSubarray().new Solution();
        solution.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int maxTurbulenceSize(int[] arr) {
//        int n = arr.length;
//        int ans =1;
//        int l = 0;
//        int r = 0;
//        while(r < n - 1){
//            if(l == r){
//                if(arr[l] == arr[l + 1]){
//                    l++;
//                }
//                r++;
//            }else {
//                if(arr[r - 1] > arr[r] && arr[r] < arr[r + 1]){
//                    r++;
//                }else if(arr[r - 1] < arr[r] && arr[r] > arr[r + 1]){
//                    r++;
//                }else {
//                    l = r;
//                    r++;
//                }
//            }
//            ans = Math.max(ans, r - l + 1);
//        }
//        return ans;
//    }

    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int ans =0;
        int[][] dp = new int[n][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                dp[i][1] = dp[i - 1][0] + 1;
                dp[i][0] = 1;
            }else if(arr[i] < arr[i - 1]){
                dp[i][0] = dp[i - 1][1] + 1;
                dp[i][1] = 1;
            }else {
                dp[i][1] = 1;
                dp[i][0] = 1;
            }
        }
        for(int[] a : dp){
            ans = Math.max(ans, a[0]);
            ans = Math.max(ans, a[1]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}