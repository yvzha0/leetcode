package leetcode.editor.cn.array;
class P667BeautifulArrangementIi{
    public static void main(String[] args){
        Solution solution = new P667BeautifulArrangementIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        ans[0] = 1;
        int idx = 1;
        int flag = 1;
        for(int i = k; i >= 1; i--){
            ans[idx] = ans[idx - 1] + i * flag;
            flag = -flag;
            idx++;
        }
        for(int i = k + 2; i <= n; i++){
            ans[idx] = i;
            idx++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}