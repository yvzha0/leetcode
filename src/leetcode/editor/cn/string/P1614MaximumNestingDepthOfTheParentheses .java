package leetcode.editor.cn.string;

class P1614MaximumNestingDepthOfTheParentheses{
    public static void main(String[] args){
        Solution solution = new P1614MaximumNestingDepthOfTheParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
                ans = Math.max(ans, count);
            }else if(c == ')'){
                count--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}