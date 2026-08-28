package leetcode.editor.cn.string;
class P557ReverseWordsInAStringIii{
    public static void main(String[] args){
        Solution solution = new P557ReverseWordsInAStringIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(new StringBuilder(word).reverse());
            sb.append(' ');
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}