package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P921MinimumAddToMakeParenthesesValid{
    public static void main(String[] args){
        Solution solution = new P921MinimumAddToMakeParenthesesValid().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    ans++;
                }else {
                    stack.pop();
                }
            }
        }
        ans += stack.size();
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}