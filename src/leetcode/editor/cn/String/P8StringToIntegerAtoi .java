package leetcode.editor.cn.String;
class P8StringToIntegerAtoi{
    public static void main(String[] args){
        Solution solution = new P8StringToIntegerAtoi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i >= n){
            return 0;
        }

        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long ans = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');

            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * ans);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}