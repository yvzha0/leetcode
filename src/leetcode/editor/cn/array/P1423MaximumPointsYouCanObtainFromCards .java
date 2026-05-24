package leetcode.editor.cn.array;

class P1423MaximumPointsYouCanObtainFromCards{
    public static void main(String[] args){
        Solution solution = new P1423MaximumPointsYouCanObtainFromCards().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windows = n - k;
        int sum = 0;
        int totalSum = 0;
        for (int point : cardPoints) {
            totalSum += point;
        }
        for(int i = 0; i < windows; i++){
            sum += cardPoints[i];
        }
        int ans = sum;
        for(int i = windows; i < n; i++){
            sum += cardPoints[i];
            sum -= cardPoints[i - windows];
            ans = Math.min(sum, ans);
        }
        return totalSum - ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}