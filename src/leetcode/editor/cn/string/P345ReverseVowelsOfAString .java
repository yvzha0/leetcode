package leetcode.editor.cn.string;
class P345ReverseVowelsOfAString{
    public static void main(String[] args){
        Solution solution = new P345ReverseVowelsOfAString().new Solution();
        solution.reverseVowels("IceCreAm");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        String a = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while(l < r){
            while(l < r && a.indexOf(chars[l]) == -1){
                l++;
            }
            while (l < r && a.indexOf(chars[r]) == -1){
                r--;
            }
            if(l < r){
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}