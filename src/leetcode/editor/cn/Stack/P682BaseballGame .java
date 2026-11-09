package leetcode.editor.cn.Stack;

import java.util.*;

class P682BaseballGame{
    public static void main(String[] args){
        Solution solution = new P682BaseballGame().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String op : operations){
            if(op.equals("+")){
                int sum = stack.pop() + stack.peek();
                stack.push(sum - stack.peek());
                stack.push(sum);
            }else if(op.equals("D")){
                stack.push(stack.peek() * 2);
            }else if(op.equals("C")){
                stack.pop();
            }else {
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}