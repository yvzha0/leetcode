package leetcode.editor.cn.Dynamic;

import java.util.Arrays;

class P1691MaximumHeightByStackingCuboids{
    public static void main(String[] args){
        Solution solution = new P1691MaximumHeightByStackingCuboids().new Solution();
        solution.maxHeight(new int[][]{
                {12,76,13},
                {68,55,30},
                {48,85,52},
                {91,7,41},
                {29,65,35}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxHeight(int[][] cuboids) {
        for(int[] cuboid : cuboids){
            Arrays.sort(cuboid);
        }
        Arrays.sort(cuboids, (a, b) -> {
            if(a[0] == b[0]){
                if(a[1] == b[1]){
                    return a[2] - b[2];
                }else {
                    return a[1] - b[1];
                }
            }else {
                return a[0] - b[0];
            }
        });
        int n = cuboids.length;
        int[] dp = new int[n];
        dp[0] = cuboids[0][2];
        int ans = dp[0];
        for(int i = 1; i < n; i++){
            for(int j = i - 1; j >= 0; j--){
                if(cuboids[i][0] >= cuboids[j][0] && cuboids[i][1] >= cuboids[j][1] && cuboids[i][2] >= cuboids[j][2]){
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i] += cuboids[i][2];
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}