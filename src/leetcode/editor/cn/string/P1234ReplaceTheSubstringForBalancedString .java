package leetcode.editor.cn.string;
class P1234ReplaceTheSubstringForBalancedString{
    public static void main(String[] args){
        Solution solution = new P1234ReplaceTheSubstringForBalancedString().new Solution();
        solution.balancedString("WWEQERQWQWWRWWERQWEQ");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int balancedString(String s) {
        int[] count = new int[4];
        char[] chars = new char[] {'Q', 'W', 'E', 'R'};
        int n = s.length();

        for(char c : s.toCharArray()){
            for(int i = 0; i < 4; i++){
                if(c == chars[i]){
                    count[i]++;
                    break;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            count[i] -= n / 4;
        }

        // 本身已经平衡
        if(count[0] <= 0 && count[1] <= 0 &&
                count[2] <= 0 && count[3] <= 0){
            return 0;
        }

        int l = 0;
        int ans = n + 1;

        for(int r = 0; r < n; r++){

            // s[r] 加入窗口
            for(int i = 0; i < 4; i++){
                if(s.charAt(r) == chars[i]){
                    count[i]--;
                    break;
                }
            }

            // 当前窗口已经覆盖所有多余字符
            while(count[0] <= 0 && count[1] <= 0 &&
                    count[2] <= 0 && count[3] <= 0){

                ans = Math.min(ans, r - l + 1);

                // s[l] 移出窗口
                for(int i = 0; i < 4; i++){
                    if(s.charAt(l) == chars[i]){
                        count[i]++;
                        break;
                    }
                }

                l++;
            }
        }

        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}