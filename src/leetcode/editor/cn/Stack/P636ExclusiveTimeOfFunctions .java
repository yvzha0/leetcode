package leetcode.editor.cn.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class P636ExclusiveTimeOfFunctions{
    public static void main(String[] args){
        Solution solution = new P636ExclusiveTimeOfFunctions().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        int pre = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String log : logs){
            String[] a = log.split(":");
            int id = Integer.parseInt(a[0]);
            int time = Integer.parseInt(a[2]);
            if(a[1].equals("start")){
                if(!stack.isEmpty()){
                    ans[stack.peek()] += time - pre;
                }
                stack.push(id);
                pre = time;
            }else {
                ans[stack.pop()] += time - pre + 1;
                pre = time + 1;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}