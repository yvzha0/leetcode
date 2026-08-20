package leetcode.editor.cn.string;
class P1221SplitAStringInBalancedStrings{
    public static void main(String[] args){
        Solution solution = new P1221SplitAStringInBalancedStrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int balancedStringSplit(String s) {
        int c1 = 0;
        int c2 = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == 'L'){
                c1++;
            }else {
                c2++;
            }
            if(c1 == c2){
                ans++;
                c1 = 0;
                c2 = 0;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}