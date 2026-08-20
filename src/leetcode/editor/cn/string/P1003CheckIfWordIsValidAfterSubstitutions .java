package leetcode.editor.cn.string;
class P1003CheckIfWordIsValidAfterSubstitutions{
    public static void main(String[] args){
        Solution solution = new P1003CheckIfWordIsValidAfterSubstitutions().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 3 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'c'){
                if(size < 2){
                    return false;
                }else {
                    if(stack[size - 1] == 'b' && stack[size - 2] == 'a'){
                        size -= 2;
                    }
                }
            }else if(c == 'b'){
                if(size < 1){
                    return false;
                }else {
                    stack[size] = 'b';
                    size++;
                }
            }else {
                stack[size] = 'a';
                size++;
            }
        }
        return size == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}