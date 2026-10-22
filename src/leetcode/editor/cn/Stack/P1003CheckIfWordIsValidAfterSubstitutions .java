package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P1003CheckIfWordIsValidAfterSubstitutions{
    public static void main(String[] args){
        Solution solution = new P1003CheckIfWordIsValidAfterSubstitutions().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == 'a'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                if(c == 'b'){
                    if(stack.peek() != 'a'){
                        return false;
                    }
                    stack.push(c);
                }else {
                    if(stack.peek() != 'b'){
                        return false;
                    }
                    stack.pop();
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}