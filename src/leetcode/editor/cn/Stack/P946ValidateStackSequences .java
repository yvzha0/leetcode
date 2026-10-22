package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P946ValidateStackSequences{
    public static void main(String[] args){
        Solution solution = new P946ValidateStackSequences().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        int j = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            // 先入栈
            stack.push(pushed[i]);

            // 栈顶等于当前需要弹出的元素，就一直弹
            while (!stack.isEmpty() && j < n && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}