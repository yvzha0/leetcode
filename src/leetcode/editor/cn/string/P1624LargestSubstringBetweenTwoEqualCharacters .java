package leetcode.editor.cn.string;

import java.util.HashMap;
import java.util.Map;

class P1624LargestSubstringBetweenTwoEqualCharacters{
    public static void main(String[] args){
        Solution solution = new P1624LargestSubstringBetweenTwoEqualCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < s.length(); i++){
            int start = map.getOrDefault(s.charAt(i), i);
            int val = i - start - 1;
            ans = Math.max(ans, val);
            map.put(s.charAt(i), start);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}