package leetcode.editor.cn.Dynamic;
class P1423MaximumPointsYouCanObtainFromCards{
    public static void main(String[] args){
        Solution solution = new P1423MaximumPointsYouCanObtainFromCards().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int preSum = 0;
        int lastSum = 0;
        int n = cardPoints.length;
        for(int i = n - 1; i >= n - k; i--){
            lastSum += cardPoints[i];
        }
        int ans = lastSum;
        for(int i = 0; i < k; i++){
            preSum += cardPoints[i];
            lastSum -= cardPoints[n - k + i];
            ans = Math.max(ans, preSum + lastSum);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}