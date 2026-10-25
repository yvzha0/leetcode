package leetcode.editor.cn.Stack;
class P880DecodedStringAtIndex{
    public static void main(String[] args){
        Solution solution = new P880DecodedStringAtIndex().new Solution();
        solution.decodeAtIndex("a2345678999999999999999", 1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                size *= c - '0';
            }else {
                size++;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            char c = s.charAt(i);
            k %= size;
            if(Character.isDigit(c)){
                size /= c - '0';
            }else {
                if(k == 0){
                    return String.valueOf(c);
                }
                size--;
            }
        }
        return "";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}