package leetcode.editor.cn.array;

import java.util.Arrays;

class P3867SumOfGcdOfFormedPairs{
    public static void main(String[] args){
        Solution solution = new P3867SumOfGcdOfFormedPairs().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mx = nums[0];
        for(int i = 0; i < n; i++){
            mx = Math.max(nums[i], mx);
            prefixGcd[i] = gcd(mx, nums[i]);
        }
        Arrays.sort(prefixGcd);
        long ans = 0;
        int i = 0;
        int j = n - 1;
        while(i < j){
            ans += gcd(prefixGcd[j], prefixGcd[i]);
            i++;
            j--;
        }
        return ans;
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}