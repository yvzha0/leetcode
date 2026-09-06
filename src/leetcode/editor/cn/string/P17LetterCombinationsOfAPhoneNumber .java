package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P17LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args){
        Solution solution = new P17LetterCombinationsOfAPhoneNumber().new Solution();
        solution.letterCombinations("234");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    String[] map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        backtrace(digits, ans, 0, new StringBuilder());
        return ans;
    }

    private void backtrace(String digits, List<String> ans, int start, StringBuilder sb){
        if(start == digits.length() - 1){
            int i = digits.charAt(start) - '0';
            for(char c : map[i].toCharArray()){
                ans.add(sb.toString() + c);
            }
            return;
        }
        int i = digits.charAt(start) - '0';
        for(char c : map[i].toCharArray()){
            sb.append(c);
            backtrace(digits, ans, start + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}