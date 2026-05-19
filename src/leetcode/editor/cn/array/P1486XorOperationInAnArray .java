package leetcode.editor.cn.array;
class P1486XorOperationInAnArray{
    public static void main(String[] args){
        Solution solution = new P1486XorOperationInAnArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for(int i = 0;i < n;i++){
            ans ^= start + 2 * i;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}