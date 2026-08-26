package leetcode.editor.cn.string;
class P925LongPressedName{
    public static void main(String[] args){
        Solution solution = new P925LongPressedName().new Solution();
        solution.isLongPressedName("alex", "aaleexa");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int n = typed.length();
        for(char c : name.toCharArray()){
            while(i < n && c != typed.charAt(i)){
                if(i == 0){
                    return false;
                }
                if(typed.charAt(i) == typed.charAt(i - 1)){
                    i++;
                }else {
                    return false;
                }
            }
            i++;
        }
        while(i < n && typed.charAt(i) == typed.charAt(i - 1)){
            i++;
        }
        return i == n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}