package leetcode.editor.cn.string;
class P43MultiplyStrings{
    public static void main(String[] args){
        Solution solution = new P43MultiplyStrings().new Solution();
        solution.multiply("2", "3");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public String multiply(String num1, String num2) {
//        if (num1.equals("0") || num2.equals("0")) {
//            return "0";
//        }
//        int m = num1.length();
//        int n = num2.length();
//        int[] ans = new int[m + n];
//        for(int i = m - 1; i >= 0; i--){
//            int x = num1.charAt(i) - '0';
//            for(int j = n - 1; j >= 0; j--){
//                int y = num2.charAt(j) - '0';
//                ans[i + j + 1] += x * y;
//            }
//        }
//        for(int i = m + n - 1; i > 0; i--){
//            ans[i - 1] += ans[i] / 10;
//            ans[i] %= 10;
//        }
//        StringBuilder sb = new StringBuilder();
//        if(ans[0] != 0){
//            sb.append(ans[0]);
//        }
//        for(int i = 1; i < m + n; i++){
//            sb.append(ans[i]);
//        }
//        return sb.toString();
//    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        String ans = "0";
        for(int i = n - 1; i >= 0; i--){
            int x = num2.charAt(i) - '0';
            StringBuilder sb = new StringBuilder();
            sb.append("0".repeat(Math.max(0, n - 1 - i)));
            int carry = 0;
            for(int j = m - 1; j >= 0; j--){
                int y = num1.charAt(j) - '0';
                int result = x * y + carry;
                sb.append(result % 10);
                carry = result / 10;
            }
            if(carry > 0){
                sb.append(carry);
            }
            ans = add(ans, sb.reverse().toString());
        }
        return ans;
    }

    private String add(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            i--;
            j--;
            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}