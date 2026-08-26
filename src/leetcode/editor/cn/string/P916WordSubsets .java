package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P916WordSubsets{
    public static void main(String[] args){
        Solution solution = new P916WordSubsets().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] need = new int[26];
        for (String s : words2) {
            int[] temp = new int[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (temp[i] != 0) {
                    need[i] = Math.max(need[i], temp[i]);
                }
            }
        }
        for(String s : words1){
            int[] temp = new int[26];
            for (char c : s.toCharArray()) {
                temp[c - 'a']++;
            }
            int i = 0;
            for (; i < 26; i++) {
                if (temp[i] < need[i]) {
                    break;
                }
            }
            if(i == 26){
                ans.add(s);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}