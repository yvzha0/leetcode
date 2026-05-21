package leetcode.editor.cn.array;

import java.util.Arrays;

class P1465MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts{
    public static void main(String[] args){
        Solution solution = new P1465MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts().new Solution();
        int[] a = {5};
        int[] b = {2,1,4};
        solution.maxArea(6, 5, a, b);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxh = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        int maxv = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for(int i = 1 ;i < horizontalCuts.length;i++){
            maxh = Math.max(maxh, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        for(int i = 1 ;i < verticalCuts.length;i++){
            maxv = Math.max(maxv, verticalCuts[i] - verticalCuts[i - 1]);
        }
        return (int) (((long) maxh * maxv) % 1000000007);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}