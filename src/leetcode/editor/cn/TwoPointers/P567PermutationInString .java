package leetcode.editor.cn.TwoPointers;

class P567PermutationInString{
    public static void main(String[] args){
        Solution solution = new P567PermutationInString().new Solution();
        solution.checkInclusion("adc", "dcda");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] need = new int[26];

        // 统计 s1 的字符需求
        for (int i = 0; i < n; i++) {
            need[s1.charAt(i) - 'a']++;
        }

        int matched = 0;

        for (int r = 0; r < m; r++) {
            // 加入右端点字符
            int in = s2.charAt(r) - 'a';

            if (need[in] > 0) {
                matched++;
            }
            need[in]--;

            // 窗口长度超过 n，移除左端点
            if (r >= n) {
                int out = s2.charAt(r - n) - 'a';

                if (need[out] >= 0) {
                    matched--;
                }
                need[out]++;
            }

            // 长度为 n，且所有字符都匹配
            if (r >= n - 1 && matched == n) {
                return true;
            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}