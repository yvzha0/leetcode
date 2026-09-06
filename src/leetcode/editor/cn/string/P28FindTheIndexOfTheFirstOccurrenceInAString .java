package leetcode.editor.cn.string;
class P28FindTheIndexOfTheFirstOccurrenceInAString{
    public static void main(String[] args){
        Solution solution = new P28FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        char start = needle.charAt(0);
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.charAt(i) == start){
                if(needle.equals(haystack.substring(i, i + needle.length()))){
                    return i;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}