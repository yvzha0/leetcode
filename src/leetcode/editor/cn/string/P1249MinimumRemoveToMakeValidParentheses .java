package leetcode.editor.cn.string;

import java.util.*;

class P1249MinimumRemoveToMakeValidParentheses{
    public static void main(String[] args){
        Solution solution = new P1249MinimumRemoveToMakeValidParentheses().new Solution();
        solution.minRemoveToMakeValid("lee(t(c)o)de)");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        Set<Integer> willdelete = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    willdelete.add(i);
                }else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            willdelete.add(stack.pop());
        }
        for(int i = 0; i < s.length(); i++){
            if(!willdelete.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}