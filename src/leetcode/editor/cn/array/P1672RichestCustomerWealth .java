package leetcode.editor.cn.array;
class P1672RichestCustomerWealth{
    public static void main(String[] args){
        Solution solution = new P1672RichestCustomerWealth().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts[0].length;
        int ans = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += account[j];
            }
            ans = Integer.max(ans, sum);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}