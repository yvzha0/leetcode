package leetcode.editor.cn.array;
class P1304FindNUniqueIntegersSumUpToZero{
    public static void main(String[] args){
        Solution solution = new P1304FindNUniqueIntegersSumUpToZero().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int pos = 0;
        for(int i = 1; i <= n / 2; i++){
            ans[pos] = i;
            pos++;
            ans[pos] = -i;
            pos++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}