package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

class P1249MinimumRemoveToMakeValidParentheses{
    public static void main(String[] args){
        Solution solution = new P1249MinimumRemoveToMakeValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> set = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else if(c == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(!set.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}