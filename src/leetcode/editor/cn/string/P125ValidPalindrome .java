package leetcode.editor.cn.string;
class P125ValidPalindrome{
    public static void main(String[] args){
        Solution solution = new P125ValidPalindrome().new Solution();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            while(l < r && (!(s.charAt(l) >= 'a' && s.charAt(l) <= 'z') && !(s.charAt(l) >= 'A' && s.charAt(l) <= 'Z') && !(s.charAt(l) >= '0' && s.charAt(l) <= '9'))){
                l++;
            }
            while(l < r && (!(s.charAt(r) >= 'a' && s.charAt(r) <= 'z') && !(s.charAt(r) >= 'A' && s.charAt(r) <= 'Z') && !(s.charAt(r) >= '0' && s.charAt(r) <= '9'))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}