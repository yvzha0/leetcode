package leetcode.editor.cn.Dynamic;

import java.util.Arrays;
import java.util.Comparator;

class P1235MaximumProfitInJobScheduling{
    public static void main(String[] args){
        Solution solution = new P1235MaximumProfitInJobScheduling().new Solution();
        solution.jobScheduling(new int[] {1,2,3,4,6}, new int[] {3,5,10,6,9}, new int[] {20,20,100,70,60});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for(int i = 0; i < n; i++){
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));
        int[] dp = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            int start = jobs[i - 1][0];
            int money = jobs[i - 1][2];

            int l = 0;
            int r = i - 1;
            while(l < r){
                int mid = l + (r - l + 1) / 2;
                int end = jobs[mid - 1][1];
                if(end > start){
                    r = mid - 1;
                }else {
                    l = mid;
                }
            }
            dp[i] = Math.max(dp[i - 1], money + dp[l]);
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}