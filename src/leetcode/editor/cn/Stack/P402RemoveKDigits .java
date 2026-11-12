package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P402RemoveKDigits{
    public static void main(String[] args){
        Solution solution = new P402RemoveKDigits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k > 0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        while(!sb.isEmpty() && sb.charAt(sb.length() - 1) == '0'){
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.isEmpty() ? "0" : sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}