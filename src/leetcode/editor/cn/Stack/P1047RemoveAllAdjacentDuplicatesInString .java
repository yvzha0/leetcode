package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P1047RemoveAllAdjacentDuplicatesInString{
    public static void main(String[] args){
        Solution solution = new P1047RemoveAllAdjacentDuplicatesInString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else {
                if(s.charAt(i) == stack.peek()){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}