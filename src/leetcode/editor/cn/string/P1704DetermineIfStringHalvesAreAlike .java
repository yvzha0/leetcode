package leetcode.editor.cn.string;
class P1704DetermineIfStringHalvesAreAlike{
    public static void main(String[] args){
        Solution solution = new P1704DetermineIfStringHalvesAreAlike().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean halvesAreAlike(String s) {
        String ss = "aeiouAEIOU";
        int n = s.length() / 2;
        int count = 0;
        for(int i = 0; i < n; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(n * 2 - 1 - i);
            if(ss.indexOf(c1) != -1){
                count++;
            }
            if(ss.indexOf(c2) != -1){
                count--;
            }
        }
        return count == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}