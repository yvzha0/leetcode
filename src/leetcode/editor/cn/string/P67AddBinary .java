package leetcode.editor.cn.string;
class P67AddBinary{
    public static void main(String[] args){
        Solution solution = new P67AddBinary().new Solution();
        solution.addBinary("11", "1");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int jinwei = 0;
        while (i >= 0 && j >= 0){
            char c1 = a.charAt(i);
            char c2 = b.charAt(j);
            int sum = c1 - '0' + c2 - '0' + jinwei;
            sb.append(sum % 2);
            jinwei = sum / 2;
            i--;
            j--;
        }
        while(i >= 0){
            char c = a.charAt(i);
            int sum = c - '0' + jinwei;
            sb.append(sum % 2);
            jinwei = sum / 2;
            i--;
        }
        while (j >= 0){
            char c = b.charAt(j);
            int sum = c - '0' + jinwei;
            sb.append(sum % 2);
            jinwei = sum / 2;
            j--;
        }
        if(jinwei != 0){
            sb.append(jinwei);
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}