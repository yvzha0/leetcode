package leetcode.editor.cn.array;

import java.util.Arrays;
import java.util.LinkedList;

class P84LargestRectangleInHistogram{
    public static void main(String[] args){
        Solution solution = new P84LargestRectangleInHistogram().new Solution();
        solution.largestRectangleArea(new int[] {2,1,5,6,2,3});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestRectangleArea(int[] heights) {
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();
        int n = heights.length;
        int[] wide = new int[n];
        Arrays.fill(wide, 1);
        for(int i = 0; i < n; i++){
            while(!stack1.isEmpty() && heights[i] < heights[stack1.peek()]){
                stack1.pop();
            }
            if(!stack1.isEmpty()){
                wide[i] += i - stack1.peek() - 1;
            }else {
                wide[i] += i;
            }
            stack1.push(i);
            while(!stack2.isEmpty() && heights[i] < heights[stack2.peek()]){
                int idx = stack2.pop();
                wide[idx] += i - idx - 1;
            }
            stack2.push(i);
        }
        while(!stack2.isEmpty()){
            int idx = stack2.pop();
            wide[idx] += n - idx - 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, heights[i] * wide[i]);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}