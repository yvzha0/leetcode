package leetcode.editor.cn.Dynamic;
class P338CountingBits{
    public static void main(String[] args){
        Solution solution = new P338CountingBits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        if(n == 0){
            return ans;
        }
        ans[1] = 1;
        int mi = 2;
        for(int i = 2; i <= n; i++){
            if((i & (i - 1)) == 0){
                mi = i;
            }
            ans[i] = ans[i - mi] + 1;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}