package leetcode.editor.cn.array;

class P11ContainerWithMostWater{
    public static void main(String[] args){
        Solution solution = new P11ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while(l < r){
            int S = (r - l) * Math.min(height[l], height[r]);
            ans = Math.max(ans, S);
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}