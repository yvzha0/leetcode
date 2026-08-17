package leetcode.editor.cn.string;
class P1573NumberOfWaysToSplitAString{
    public static void main(String[] args){
        Solution solution = new P1573NumberOfWaysToSplitAString().new Solution();
        solution.numWays("10101");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numWays(String s) {
        int n = s.length();
        int total = 0;
        int mod = 1000000007;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                total++;
            }
        }
        if(total % 3 != 0){
            return 0;
        }
        if(total == 0){
            long ans = (long) (n - 1) * (n - 2) / 2 % mod;
            return (int) ans;
        }
        int k = total / 3;

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                count++;

                if (count == k) {
                    p1 = i;
                } else if (count == k + 1) {
                    p2 = i;
                }
                if (count == 2 * k) {
                    p3 = i;
                } else if (count == 2 * k + 1) {
                    p4 = i;
                }
            }
        }

        long first = p2 - p1;
        long second = p4 - p3;

        return (int) (first * second % mod);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}