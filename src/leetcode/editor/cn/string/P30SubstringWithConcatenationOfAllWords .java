package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P30SubstringWithConcatenationOfAllWords{
    public static void main(String[] args){
        Solution solution = new P30SubstringWithConcatenationOfAllWords().new Solution();
        solution.findSubstring("barfoothefoobarman", new String[] {"foo","bar"});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<String, Integer> need;
    public List<Integer> findSubstring(String s, String[] words) {
        need = new HashMap<>();
        for(String word : words){
            need.put(word, need.getOrDefault(word, 0) + 1);
        }
        int m = s.length();
        int n = words.length;
        int len = words[0].length();
        if(m < n * len){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < len; i++){
            int l = i;
            int r = i;
            int count = 0;
            Map<String, Integer> map = new HashMap<>();
            while(r <= m - len){
                String word = s.substring(r, r + len);
                r += len;
                if(!need.containsKey(word)){
                    map.clear();
                    l = r;
                    count = 0;
                    continue;
                }

                map.put(word, map.getOrDefault(word, 0) + 1);
                count++;

                while(map.get(word) > need.get(word)){
                    String a = s.substring(l ,l + len);
                    map.put(a, map.get(a) - 1);
                    l += len;
                    count--;
                }

                if(count == n){
                    ans.add(l);
                    String a = s.substring(l ,l + len);
                    map.put(a, map.get(a) - 1);
                    l += len;
                    count--;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}