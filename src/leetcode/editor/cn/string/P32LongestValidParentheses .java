package leetcode.editor.cn.string;

class P32LongestValidParentheses{
    public static void main(String[] args){
        Solution solution = new P32LongestValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int longestValidParentheses(String s) {
//        Deque<Integer> stack = new ArrayDeque<>();
//        int n = s.length();
//        int[] dp = new int[n + 1];
//        int ans = 0;
//        for(int i = 1; i <= n; i++){
//            char c = s.charAt(i - 1);
//            if(c == '('){
//                stack.push(i);
//            }else {
//                if(!stack.isEmpty()){
//                    int j = stack.pop();
//                    dp[i] = dp[i - 1] + 2 + dp[j - 1];
//                }
//            }
//            ans = Math.max(ans, dp[i]);
//        }
//        return ans;
//    }
    public int longestValidParentheses(String s) {
        int ans = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                l++;
            }else {
                r++;
            }
            if(l == r){
                ans = Math.max(ans, 2 * r);
            }else if(r > l){
                l = 0;
                r = 0;
            }
        }

        l = 0; r = 0;
        for(int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == '('){
                l++;
            }else {
                r++;
            }
            if(l == r){
                ans = Math.max(ans, 2 * r);
            }else if(r < l){
                l = 0;
                r = 0;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}