package leetcode.editor.cn.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class P76MinimumWindowSubstring{
    public static void main(String[] args){
        Solution solution = new P76MinimumWindowSubstring().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        Map<Character, Integer> cur = new HashMap<>();
        for(char c : t.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        int l = 0;
        int valid = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(count.containsKey(c)){
                cur.put(c, cur.getOrDefault(c, 0) + 1);
                if(Objects.equals(count.get(c), cur.get(c))){
                    valid++;
                }
            }
            while(valid == count.size()){
                if(r - l + 1 < minLen){
                    minLen = r - l + 1;
                    start = l;
                }
                char d = s.charAt(l);
                l++;
                if(count.containsKey(d)){
                    if(Objects.equals(count.get(d), cur.get(d))){
                        valid--;
                    }
                    cur.put(d, cur.get(d) - 1);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}