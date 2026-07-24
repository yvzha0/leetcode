package leetcode.editor.cn.string;

import java.util.HashSet;
import java.util.Set;

class P1684CountTheNumberOfConsistentStrings{
    public static void main(String[] args){
        Solution solution = new P1684CountTheNumberOfConsistentStrings().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        int ans = 0;
        for(String word : words){
            ans++;
            for(char c : word.toCharArray()){
                if(!set.contains(c)){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}