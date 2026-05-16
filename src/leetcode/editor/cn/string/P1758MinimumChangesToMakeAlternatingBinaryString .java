package leetcode.editor.cn.string;
class P1758MinimumChangesToMakeAlternatingBinaryString{
    public static void main(String[] args){
        Solution solution = new P1758MinimumChangesToMakeAlternatingBinaryString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0;i < n;i++){
            // 变成010101...形式
            if(s.charAt(i) - '0' != i % 2){
                ans++;
            }
        }
        ans = Integer.min(ans, s.length() - ans);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}