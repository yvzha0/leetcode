package leetcode.editor.cn.string;

class P647PalindromicSubstrings{
    public static void main(String[] args){
        Solution solution = new P647PalindromicSubstrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int countSubstrings(String s) {
//        int n = s.length();
//
//        boolean[][] dp = new boolean[n][n];
//
//        int ans = 0;
//        for(int i = n - 1; i >= 0; i--){
//            for(int j = i; j < n; j++){
//                if(s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])){
//                    dp[i][j] = true;
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }

    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += expand(s, i, i);
            ans += expand(s, i, i + 1);
        }
        return ans;
    }

    private int expand(String s, int l, int r){
        int count = 0;
        int n = s.length();
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}