package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P22GenerateParentheses{
    public static void main(String[] args){
        Solution solution = new P22GenerateParentheses().new Solution();
        solution.generateParenthesis(3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrace(n, ans, 0, 0, new StringBuilder());
        return ans;
    }

    private void backtrace(int n, List<String> ans, int l, int r ,StringBuilder sb){
        if(sb.length() == 2 * n){
            ans.add(sb.toString());
            return;
        }
        if(l < n){
            sb.append('(');
            backtrace(n, ans, l + 1, r, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(r < n && r < l){
            sb.append(')');
            backtrace(n, ans, l, r + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}