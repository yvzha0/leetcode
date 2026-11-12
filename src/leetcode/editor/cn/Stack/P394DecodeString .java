package leetcode.editor.cn.Stack;
class P394DecodeString{
    public static void main(String[] args){
        Solution solution = new P394DecodeString().new Solution();
        solution.decodeString("3[a]2[bc]");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                sb.append(c);
                i++;
            }else {
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                int start = ++i;
                int l = 1;
                int r = 0;
                while(l != r){
                    if(s.charAt(i) == '['){
                        l++;
                    }else if(s.charAt(i) == ']'){
                        r++;
                    }
                    i++;
                }
                sb.append(decodeString(s.substring(start, i - 1)).repeat(num));
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}