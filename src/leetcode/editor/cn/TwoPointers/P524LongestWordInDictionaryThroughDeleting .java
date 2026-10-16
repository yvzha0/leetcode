package leetcode.editor.cn.TwoPointers;

import java.util.List;

class P524LongestWordInDictionaryThroughDeleting{
    public static void main(String[] args){
        Solution solution = new P524LongestWordInDictionaryThroughDeleting().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for(String word : dictionary){
            if(isSub(s, word)){
                if(word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0)){
                    ans = word;
                }
            }
        }
        return ans;
    }

    private boolean isSub(String s, String word){
        int m = s.length();
        int n = word.length();
        if(m < n){
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if(s.charAt(i) == word.charAt(j)){
                j++;
            }
            i++;
        }
        return j == n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}