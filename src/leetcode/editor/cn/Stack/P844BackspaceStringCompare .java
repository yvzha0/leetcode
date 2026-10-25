package leetcode.editor.cn.Stack;
class P844BackspaceStringCompare{
    public static void main(String[] args){
        Solution solution = new P844BackspaceStringCompare().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '#'){
                sb.append(c);
            }else {
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}