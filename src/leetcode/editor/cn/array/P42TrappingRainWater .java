package leetcode.editor.cn.array;

import java.util.LinkedList;

class P42TrappingRainWater{
    public static void main(String[] args){
        Solution solution = new P42TrappingRainWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int trap(int[] height) {
//        int n = height.length;
//        int[] rmax = new int[n + 1];
//        for(int i = n - 1; i >= 0; i--){
//            rmax[i] = Math.max(height[i], rmax[i + 1]);
//        }
//        int lmax = 0;
//        int ans = 0;
//        for(int i = 0; i < n; i++){
//            lmax = Math.max(lmax, height[i]);
//            ans += Math.min(lmax, rmax[i]) - height[i];
//        }
//        return ans;
//    }

    public int trap(int[] height) {
        int n = height.length;
        LinkedList<Integer> stack = new LinkedList<>();
        int ans = 0;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int index = stack.pop();
                if(stack.isEmpty()){
                    break;
                }else {
                    ans += (Math.min(height[stack.peek()], height[i]) - height[index]) * (i - stack.peek() - 1);
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}