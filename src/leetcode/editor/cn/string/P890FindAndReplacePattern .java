package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.List;

class P890FindAndReplacePattern{
    public static void main(String[] args){
        Solution solution = new P890FindAndReplacePattern().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        String pNorm = normalize(pattern); // 获取 pattern 的标准形态

        for (String word : words) {
            // 如果单词的标准形态和 pattern 一样，就匹配
            if (normalize(word).equals(pNorm)) {
                ans.add(word);
            }
        }
        return ans;
    }

    // 辅助方法：将字符串转换为标准形态 (如 "mee" -> "abb")
    private String normalize(String s) {
        char[] map = new char[26];
        char id = 'a'; // 用 a, b, c... 来标记第几个出现的不同字符
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (map[c - 'a'] == 0) {
                map[c - 'a'] = id++; // 第一次出现，分配一个新的字母
            }
            sb.append(map[c - 'a']); // 追加映射后的字母
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}