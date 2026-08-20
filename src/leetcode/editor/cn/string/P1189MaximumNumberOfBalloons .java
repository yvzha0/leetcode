package leetcode.editor.cn.string;
class P1189MaximumNumberOfBalloons{
    public static void main(String[] args){
        Solution solution = new P1189MaximumNumberOfBalloons().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        int n = text.length();
        for(int i = 0; i < n; i++){
            count[text.charAt(i) - 'a']++;
        }
        int ans = count['b' - 'a'];
        ans = Math.min(ans, count['a' - 'a']);
        ans = Math.min(ans, count['l' - 'a'] / 2);
        ans = Math.min(ans, count['o' - 'a'] / 2);
        ans = Math.min(ans, count['n' - 'a']);
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}