package leetcode.editor.cn.TwoPointers;
class P844BackspaceStringCompare{
    public static void main(String[] args){
        Solution solution = new P844BackspaceStringCompare().new Solution();
        solution.backspaceCompare("ab##", "c#d#");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int count1 = 0;
        int count2 = 0;
        while(i >= 0 || j >= 0){
            while(i >= 0){
                if(s.charAt(i) == '#'){
                    i--;
                    count1++;
                }else if(count1 > 0){
                    i--;
                    count1--;
                }else {
                    break;
                }
            }
            while(j >= 0){
                if(t.charAt(j) == '#'){
                    j--;
                    count2++;
                }else if(count2 > 0){
                    j--;
                    count2--;
                }else {
                    break;
                }
            }
            if(i < 0 || j < 0){
                return i == j;
            }
            if(s.charAt(i) != t.charAt(j)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}