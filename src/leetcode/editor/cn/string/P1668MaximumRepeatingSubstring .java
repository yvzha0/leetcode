package leetcode.editor.cn.string;

class P1668MaximumRepeatingSubstring{
    public static void main(String[] args){
        Solution solution = new P1668MaximumRepeatingSubstring().new Solution();
        solution.maxRepeating("ababc", "ab");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int maxRepeating(String sequence, String word) {
//        int k = sequence.length() / word.length();
//        for(; k >= 0; k--){
//            if(sequence.contains(word.repeat(k))){
//                return k;
//            }
//        }
//        return 0;
//    }

    public int maxRepeating(String sequence, String word) {
        int m = word.length();
        int n = sequence.length();
        int[] dp = new int[n];
        int ans = 0;
        for(int i = m - 1; i < n; i++){
            int start = i - m + 1;
            if(word.equals(sequence.substring(start, start + m))){
                if(i > m - 1){
                    dp[i] = dp[start - 1] + 1;
                }else {
                    dp[i] = 1;
                }
                ans = Math.max(ans, dp[i]);
            }
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}