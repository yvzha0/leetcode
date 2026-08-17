package leetcode.editor.cn.string;
class P1332RemovePalindromicSubsequences{
    public static void main(String[] args){
        Solution solution = new P1332RemovePalindromicSubsequences().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removePalindromeSub(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return 2;
            }
            l++;
            r--;
        }
        return 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}