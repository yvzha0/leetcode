package leetcode.editor.cn.array;

class P1170CompareStringsByFrequencyOfTheSmallestCharacter{
    public static void main(String[] args){
        Solution solution = new P1170CompareStringsByFrequencyOfTheSmallestCharacter().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int length = queries.length;
        int[] count = new int[12];
        for (String word : words) {
            count[f(word)]++;
        }
        for(int i = 9; i > 0; i--){
            count[i] += count[i+1];
        }
        int[] ans = new int[length];
        for(int i = 0; i < length; i++){
            ans[i] = count[f(queries[i]) + 1];
        }
        return ans;
    }

    private int f(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        for(int i : count){
            if (i != 0){
                return i;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}