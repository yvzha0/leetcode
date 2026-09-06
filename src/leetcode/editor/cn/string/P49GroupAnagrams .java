package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P49GroupAnagrams{
    public static void main(String[] args){
        Solution solution = new P49GroupAnagrams().new Solution();
        solution.groupAnagrams(new String[] {"aab", "aba", "cac", "cca"});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            String reS = reMake(s);
            List<String> list = map.getOrDefault(reS, new ArrayList<>());
            list.add(s);
            map.put(reS, list);
        }
        return new ArrayList<>(map.values());
    }

    String reMake(String s){
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            char c = (char) (i + 'a');
            sb.append(String.valueOf(c).repeat(count[i]));
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}