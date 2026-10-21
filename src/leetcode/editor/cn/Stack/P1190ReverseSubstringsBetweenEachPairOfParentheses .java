package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P1190ReverseSubstringsBetweenEachPairOfParentheses{
    public static void main(String[] args){
        Solution solution = new P1190ReverseSubstringsBetweenEachPairOfParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(sb);
                sb = new StringBuilder();
            }else if(c == ')'){
                sb = stack.pop().append(sb.reverse());
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}