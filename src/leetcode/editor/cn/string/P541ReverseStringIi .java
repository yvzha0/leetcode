package leetcode.editor.cn.string;
class P541ReverseStringIi{
    public static void main(String[] args){
        Solution solution = new P541ReverseStringIi().new Solution();
        solution.reverseStr("abcd", 2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}