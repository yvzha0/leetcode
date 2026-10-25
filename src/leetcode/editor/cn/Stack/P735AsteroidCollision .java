package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class P735AsteroidCollision{
    public static void main(String[] args){
        Solution solution = new P735AsteroidCollision().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int asteroid : asteroids){
            if(asteroid > 0){
                stack.push(asteroid);
                continue;
            }
            while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0 && stack.peek() + asteroid < 0){
                stack.pop();
            }
            if(stack.isEmpty() || stack.peek() < 0){
                stack.push(asteroid);
            }else {
                if(stack.peek() + asteroid == 0){
                    stack.pop();
                }
            }
        }
        int n = stack.size();
        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}