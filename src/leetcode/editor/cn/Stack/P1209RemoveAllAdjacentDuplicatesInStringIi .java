package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P1209RemoveAllAdjacentDuplicatesInStringIi{
    public static void main(String[] args){
        Solution solution = new P1209RemoveAllAdjacentDuplicatesInStringIi().new Solution();
        solution.removeDuplicates("deeedbbcccbdaa", 3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    class Pair{
        private char key;
        private int val;

        public Pair(char key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || stack.peek().key != c){
                stack.push(new Pair(c, 1));
            }else {
                if(stack.peek().val == k - 1){
                    stack.pop();
                }else {
                    stack.peek().val++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            sb.append(String.valueOf(pair.key).repeat(Math.max(0, pair.val)));
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}