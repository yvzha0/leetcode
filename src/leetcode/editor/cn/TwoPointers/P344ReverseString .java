package leetcode.editor.cn.TwoPointers;
class P344ReverseString{
    public static void main(String[] args){
        Solution solution = new P344ReverseString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}