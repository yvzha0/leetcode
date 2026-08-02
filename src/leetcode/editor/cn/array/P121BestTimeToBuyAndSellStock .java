package leetcode.editor.cn.array;
class P121BestTimeToBuyAndSellStock{
    public static void main(String[] args){
        Solution solution = new P121BestTimeToBuyAndSellStock().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxEarn = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > minPrice){
                maxEarn = Math.max(maxEarn, prices[i] - minPrice);
            }else {
                minPrice = prices[i];
            }
        }
        return maxEarn;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}