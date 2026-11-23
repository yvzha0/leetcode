package leetcode.editor.cn.String;

import java.util.HashMap;
import java.util.Map;

class P3LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args){
        Solution solution = new P3LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        int ans = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            if(map.getOrDefault(c, false)){
                while(s.charAt(l) != c){
                    map.put(s.charAt(l), false);
                    l++;
                }
                l++;
            }
            map.put(c, true);
            ans = Math.max(r - l + 1, ans);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}