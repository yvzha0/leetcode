package leetcode.editor.cn.string;
class P1694ReformatPhoneNumber{
    public static void main(String[] args){
        Solution solution = new P1694ReformatPhoneNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");
        int n = number.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i += 3){
            if(n - i == 2 || n - i == 3){
                sb.append(number, i, n);
            }else if(n - i == 4){
                sb.append(number, i, i + 2).append("-").append(number, i + 2, n);
                break;
            }else {
                sb.append(number, i, i + 3).append("-");
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}