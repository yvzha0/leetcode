package leetcode.editor.cn.String;
class P6ZigzagConversion{
    public static void main(String[] args){
        Solution solution = new P6ZigzagConversion().new Solution();
        solution.convert("PAYPALISHIRING", 4);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        int cycle = (numRows - 1) * 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += cycle) {
                sb.append(s.charAt(j));

                // 中间行还需要添加斜线上的字符
                int k = j + cycle - 2 * i;
                if (i > 0 && i < numRows - 1 && k < s.length()) {
                    sb.append(s.charAt(k));
                }
            }
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}