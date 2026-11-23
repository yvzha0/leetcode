package leetcode.editor.cn.TwoPointers;
class P125ValidPalindrome{
    public static void main(String[] args){
        Solution solution = new P125ValidPalindrome().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(Character.toLowerCase(c));
            }else if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        int l = 0;
        int r = sb.length() - 1;
        while(l < r){
            if(sb.charAt(l) != sb.charAt(r)){
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