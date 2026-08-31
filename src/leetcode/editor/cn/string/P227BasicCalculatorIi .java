package leetcode.editor.cn.string;

import java.util.ArrayDeque;
import java.util.Deque;

class P227BasicCalculatorIi{
    public static void main(String[] args){
        Solution solution = new P227BasicCalculatorIi().new Solution();
        solution.calculate("0-2147483647");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");
        int index = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        int n = s.length();
        while(index < n && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
            num = num * 10 + s.charAt(index) - '0';
            index++;
        }
        stack.push(num);
        num = 0;
        while(index < n){
            char c = s.charAt(index);
            index++;
            while(index < n && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                num = num * 10 + s.charAt(index) - '0';
                index++;
            }
            if(c == '*'){
                stack.push(stack.pop() * num);
            }else if(c == '/'){
                stack.push(stack.pop() / num);
            }else if(c == '+'){
                stack.push(num);
            }else {
                stack.push(-num);
            }
            num = 0;
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