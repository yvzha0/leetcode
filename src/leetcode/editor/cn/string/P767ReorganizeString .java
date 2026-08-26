package leetcode.editor.cn.string;
class P767ReorganizeString{
    public static void main(String[] args){
        Solution solution = new P767ReorganizeString().new Solution();
        solution.reorganizeString("aab");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int n = s.length();
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }

        int maxIndex = 0;
        for (int i = 1; i < 26; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }

        if (count[maxIndex] > (n + 1) / 2) {
            return "";
        }

        char[] ans = new char[n];
        int index = 0;

        while (count[maxIndex] > 0) {
            ans[index] = (char) (maxIndex + 'a');
            index += 2;
            count[maxIndex]--;
        }

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= n) {
                    index = 1;
                }

                ans[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }

        return new String(ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}