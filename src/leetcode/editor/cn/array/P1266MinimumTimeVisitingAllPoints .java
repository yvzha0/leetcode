package leetcode.editor.cn.array;
class P1266MinimumTimeVisitingAllPoints{
    public static void main(String[] args){
        Solution solution = new P1266MinimumTimeVisitingAllPoints().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        for(int i = 1; i < n; i++){
            int x = Math.abs(points[i-1][0] - points[i][0]);
            int y = Math.abs(points[i-1][1] - points[i][1]);
            ans += Math.max(x, y);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}