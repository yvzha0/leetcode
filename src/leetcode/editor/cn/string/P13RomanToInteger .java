package leetcode.editor.cn.string;
class P13RomanToInteger{
    public static void main(String[] args){
        Solution solution = new P13RomanToInteger().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        int[] map = new int[26];
        map['I' - 'A'] = 1;
        map['V' - 'A'] = 5;
        map['X' - 'A'] = 10;
        map['L' - 'A'] = 50;
        map['C' - 'A'] = 100;
        map['D' - 'A'] = 500;
        map['M' - 'A'] = 1000;
        int ans = 0;
        int n = s.length();
        for(int i = 0; i < n - 1; i++){
            char c = s.charAt(i);
            if(map[c - 'A'] < map[s.charAt(i + 1) - 'A']){
                ans -= map[c - 'A'];
            }else {
                ans += map[c - 'A'];
            }
        }
        ans += map[s.charAt(n - 1) - 'A'];
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}