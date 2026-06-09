package leetcode.editor.cn.array;
class P1160FindWordsThatCanBeFormedByCharacters{
    public static void main(String[] args){
        Solution solution = new P1160FindWordsThatCanBeFormedByCharacters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] h = new int[26];
        for(char c : chars.toCharArray()){
            h[c - 'a']++;
        }
        int ans = 0;
        for(String word : words){
            int[] count = new int[26];
            for(char c : word.toCharArray()){
                count[c - 'a']++;
            }
            ans += word.length();
            for(int i = 0; i < 26; i++){
                if(count[i] > h[i]){
                    ans -= word.length();
                    break;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}