package leetcode.editor.cn.string;

import java.util.*;

class P966VowelSpellchecker{
    public static void main(String[] args){
        Solution solution = new P966VowelSpellchecker().new Solution();
        solution.spellchecker(new String[] {"KiTe","kite","hare","Hare"}, new String[] {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();

        for (String word : wordlist) {
            exact.add(word);

            String lower = word.toLowerCase();
            String mask = mask(lower);

            lowerMap.putIfAbsent(lower, word);
            vowelMap.putIfAbsent(mask, word);
        }

        String[] ans = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            if (exact.contains(query)) {
                ans[i] = query;
                continue;
            }

            String lower = query.toLowerCase();

            if (lowerMap.containsKey(lower)) {
                ans[i] = lowerMap.get(lower);
                continue;
            }

            String mask = mask(lower);
            ans[i] = vowelMap.getOrDefault(mask, "");
        }

        return ans;
    }

    private String mask(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}