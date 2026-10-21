package leetcode.editor.cn.Stack;
class P1021RemoveOutermostParentheses{
    public static void main(String[] args){
        Solution solution = new P1021RemoveOutermostParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeOuterParentheses(String s) {
        int l = 0;
        int r = 0;
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c);
            if(c == '('){
                l++;
            }else {
                r++;
            }
            if(l == r){
                ans.append(sb, 1, sb.length() - 1);
                sb.setLength(0);
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}