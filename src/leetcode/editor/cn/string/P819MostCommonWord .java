package leetcode.editor.cn.string;

import java.util.*;

class P819MostCommonWord{
    public static void main(String[] args){
        Solution solution = new P819MostCommonWord().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();

        StringBuilder word = new StringBuilder();
        String ans = "";
        int max = 0;

        for (int i = 0; i <= paragraph.length(); i++) {
            if (i < paragraph.length() && Character.isLetter(paragraph.charAt(i))) {
                word.append(Character.toLowerCase(paragraph.charAt(i)));
            } else if (!word.isEmpty()) {
                String s = word.toString();

                if (!bannedSet.contains(s)) {
                    int freq = count.getOrDefault(s, 0) + 1;
                    count.put(s, freq);

                    if (freq > max) {
                        max = freq;
                        ans = s;
                    }
                }

                word.setLength(0);
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}