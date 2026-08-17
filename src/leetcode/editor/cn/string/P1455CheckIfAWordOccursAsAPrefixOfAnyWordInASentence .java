package leetcode.editor.cn.string;
class P1455CheckIfAWordOccursAsAPrefixOfAnyWordInASentence{
    public static void main(String[] args){
        Solution solution = new P1455CheckIfAWordOccursAsAPrefixOfAnyWordInASentence().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            if(words[i].startsWith(searchWord)){
                return i + 1;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}