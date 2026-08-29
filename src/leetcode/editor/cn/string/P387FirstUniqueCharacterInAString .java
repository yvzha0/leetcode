package leetcode.editor.cn.string;
class P387FirstUniqueCharacterInAString{
    public static void main(String[] args){
        Solution solution = new P387FirstUniqueCharacterInAString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        int ans = -1;
        for(int i = 0; i < 26; i++){
            if(count[i] == 1){
                int index = s.indexOf(i + 'a');
                if(ans == -1){
                    ans = index;
                }else {
                    ans = Math.min(ans, index);
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}