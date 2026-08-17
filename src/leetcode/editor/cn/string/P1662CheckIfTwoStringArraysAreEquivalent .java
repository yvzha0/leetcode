package leetcode.editor.cn.string;
class P1662CheckIfTwoStringArraysAreEquivalent{
    public static void main(String[] args){
        Solution solution = new P1662CheckIfTwoStringArraysAreEquivalent().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String word : word1){
            sb1.append(word);
        }
        for(String word : word2){
            sb2.append(word);
        }
        return sb1.compareTo(sb2) == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}