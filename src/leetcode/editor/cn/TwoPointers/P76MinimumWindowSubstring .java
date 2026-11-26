package leetcode.editor.cn.TwoPointers;

import java.util.HashMap;
import java.util.Map;

class P76MinimumWindowSubstring{
    public static void main(String[] args){
        Solution solution = new P76MinimumWindowSubstring().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        if (m < n || n == 0) {
            return "";
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // 统计 t 中每个字符的需求次数
        for (char c : t.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int r = 0; r < m; r++) {
            char c = s.charAt(r);

            // 1. 扩大窗口
            if (map1.containsKey(c)) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);

                if (map2.get(c) <= map1.get(c)) {
                    count++;
                }
            }

            // 2. 当窗口满足条件时，尝试收缩窗口
            while (count == n) {

                // 更新最小覆盖子串
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char d = s.charAt(l);

                // 移除左边界字符
                if (map1.containsKey(d)) {
                    map2.put(d, map2.get(d) - 1);

                    if (map2.get(d) < map1.get(d)) {
                        count--;
                    }
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}