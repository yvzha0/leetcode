package leetcode.editor.cn.string;
class P537ComplexNumberMultiplication{
    public static void main(String[] args){
        Solution solution = new P537ComplexNumberMultiplication().new Solution();
        solution.complexNumberMultiply("1+1i", "1+1i");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1 = num1.split("\\+");
        int a1 = Integer.parseInt(s1[0]);
        int b1 = Integer.parseInt(s1[1].replace("i", ""));
        String[] s2 = num2.split("\\+");
        int a2 = Integer.parseInt(s2[0]);
        int b2 = Integer.parseInt(s2[1].replace("i", ""));
        int a3 = a1 * a2 - b1 * b2;
        int b3 = a1 * b2 + a2 * b1;
        return String.valueOf(a3) + '+' + String.valueOf(b3) + 'i';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}