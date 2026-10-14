package leetcode.editor.cn.TwoPointers;

import java.util.*;

class P828CountUniqueCharactersOfAllSubstringsOfAGivenString{
    public static void main(String[] args){
        Solution solution = new P828CountUniqueCharactersOfAllSubstringsOfAGivenString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniqueLetterString(String s) {
        int[] last = new int[26];
        int[] pre = new int[26];
        Arrays.fill(last, -1);
        Arrays.fill(pre, -1);
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int c = s.charAt(i) - 'A';
            if(last[c] != -1){
                ans += (i - last[c]) * (last[c] - pre[c]);
            }

            pre[c] = last[c];
            last[c] = i;
        }

        for(int i = 0; i < 26; i++){
            if(last[i] != -1){
                ans += (n - last[i]) * (last[i] - pre[i]);
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}