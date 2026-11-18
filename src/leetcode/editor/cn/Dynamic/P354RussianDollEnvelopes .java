package leetcode.editor.cn.Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P354RussianDollEnvelopes{
    public static void main(String[] args){
        Solution solution = new P354RussianDollEnvelopes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int maxEnvelopes(int[][] envelopes) {
//        Arrays.sort(envelopes, (a, b) -> {
//            if(a[0] == b[0]){
//                return b[1] - a[1];
//            }
//            return b[0] - a[0];
//        });
//
//        int n = envelopes.length;
//
//        int[] dp = new int[n];
//        Arrays.fill(dp, 1);
//        int ans = 1;
//
//        for(int i = 1; i < n; i++){
//            for(int j = i - 1; j >= 0; j--){
//                if(envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]){
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//            ans = Math.max(ans, dp[i]);
//        }
//
//        return ans;
//    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        List<Integer> tails = new ArrayList<>();

        for(int[] e : envelopes){
            int h = e[1];

            int l = 0;
            int r = tails.size();

            while(l < r){
                int mid = l + (r - l) / 2;

                if(tails.get(mid) >= h){
                    r = mid;
                }else {
                    l = mid + 1;
                }
            }

            if(l == tails.size()){
                tails.add(h);
            }else {
                tails.set(l, h);
            }
        }

        return tails.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}