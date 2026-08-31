package leetcode.editor.cn.string;

class P151ReverseWordsInAString{
    public static void main(String[] args){
        Solution solution = new P151ReverseWordsInAString().new Solution();
        solution.reverseWords("  hello world  ");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        int n = s.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(n >= 0){
            while(n >= 0 && s.charAt(n) == ' '){
                n--;
            }
            if (n < 0) {
                break;
            }
            int end = n;
            while(n >= 0 && s.charAt(n) != ' '){
                n--;
            }
            if(!sb.isEmpty()){
                sb.append(' ');
            }
            sb.append(s, n + 1, end + 1);
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}