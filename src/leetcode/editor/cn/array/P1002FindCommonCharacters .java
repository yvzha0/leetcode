package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1002FindCommonCharacters{
    public static void main(String[] args){
        Solution solution = new P1002FindCommonCharacters().new Solution();
        String[] words = {"bella","label","roller"};
        solution.commonChars(words);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] words) {
        int[] a = new int[26];
        for(int i = 0; i < words[0].length(); i++){
            a[words[0].charAt(i) - 'a']++;
        }
        for(int i = 1; i < words.length; i++){
            String word = words[i];
            int[] b = new int[26];
            for(int j = 0; j < word.length(); j++){
                b[word.charAt(j) - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                a[j] = Math.min(a[j], b[j]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < a[i]; j++){
                ans.add(Character.toString(i + 'a'));
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}