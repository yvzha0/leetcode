package leetcode.editor.cn.String;
class P5LongestPalindromicSubstring{
    public static void main(String[] args){
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        solution.longestPalindrome("babad");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        int max = 1;
        String ans = String.valueOf(s.charAt(0));
        for(int i = 0; i < s.length(); i++){
            String s1 = build(s, i, i);
            String s2 = build(s, i, i + 1);
            if(s1.length() > s2.length() && s1.length() > max){
                max = s1.length();
                ans = s1;
            }else if(s2.length() > s1.length() && s2.length() > max){
                max = s2.length();
                ans = s2;
            }
        }
        return ans;
    }

    private String build(String s, int i, int j){
        int start = -1;
        int len = -1;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            start = i;
            len = j - i + 1;
            i--;
            j++;
        }
        return start == -1 ? "" : s.substring(start, start + len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}