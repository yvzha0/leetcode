package leetcode.editor.cn.Dynamic;
class P357CountNumbersWithUniqueDigits{
    public static void main(String[] args){
        Solution solution = new P357CountNumbersWithUniqueDigits().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans += f(i);
        }
        return ans;
    }
    private int f(int n){
        if(n == 1){
            return 10;
        }
        int res = 9;
        for(int i = 1; i < n; i++){
            res *= 10 - i;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}