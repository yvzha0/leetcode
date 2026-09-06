package leetcode.editor.cn.string;

import java.util.*;

class P20ValidParentheses{
    public static void main(String[] args){
        Solution solution = new P20ValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char a = stack.pop();
                if((c == ')' && a != '(') || (c == '}' && a != '{') || (c == ']' && a != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}