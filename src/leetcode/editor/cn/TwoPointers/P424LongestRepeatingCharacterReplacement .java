package leetcode.editor.cn.TwoPointers;

class P424LongestRepeatingCharacterReplacement{
    public static void main(String[] args){
        Solution solution = new P424LongestRepeatingCharacterReplacement().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] count = new int[26];
        int maxCount = 0;
        int l = 0;
        int ans = 0;
        for(int r = 0; r < n; r++){
            count[s.charAt(r) - 'A']++;
            for(int cnt : count){
                maxCount = Math.max(maxCount, cnt);
            }
            while(r - l + 1 - maxCount > k){
                count[s.charAt(l) - 'A']--;
                maxCount = 0;
                for(int cnt : count){
                    maxCount = Math.max(maxCount, cnt);
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}