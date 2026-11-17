package leetcode.editor.cn.Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class P368LargestDivisibleSubset{
    public static void main(String[] args){
        Solution solution = new P368LargestDivisibleSubset().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] dp = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp, 1);
        Arrays.fill(pre, -1);
        int maxIndex = 0;
        int max = 1;
        for(int i = 1; i < n; i++){
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] % nums[j] == 0){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        pre[i] = j;
                    }
                }
            }
            if(dp[i] > max){
                max = dp[i];
                maxIndex = i;
            }
        }

        while(maxIndex != -1){
            ans.add(nums[maxIndex]);
            maxIndex = pre[maxIndex];
        }

        Collections.reverse(ans);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}