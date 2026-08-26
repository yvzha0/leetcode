package leetcode.editor.cn.string;

class P856ScoreOfParentheses{
    public static void main(String[] args){
        Solution solution = new P856ScoreOfParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int scoreOfParentheses(String s) {
        if(s.equals("()")){
            return 1;
        }
        int balance = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                balance++;
            }else {
                balance--;
            }
            if(balance == 0){
                if(i != s.length() - 1){
                    String A = s.substring(0, i + 1);
                    String B = s.substring(i + 1);
                    return scoreOfParentheses(A) + scoreOfParentheses(B);
                }
            }
        }
        String in = s.substring(1, s.length() - 1);
        return 2 * scoreOfParentheses(in);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}