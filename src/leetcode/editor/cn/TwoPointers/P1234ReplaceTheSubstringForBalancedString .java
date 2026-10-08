package leetcode.editor.cn.TwoPointers;
class P1234ReplaceTheSubstringForBalancedString{
    public static void main(String[] args){
        Solution solution = new P1234ReplaceTheSubstringForBalancedString().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int balancedString(String s) {
        int[] count = new int[4];
        int n = s.length();
        int target = n / 4;
        for(char c : s.toCharArray()){
            count[index(c)]++;
        }
        if(count[0] == target && count[1] == target && count[2] == target && count[3] == target){
            return 0;
        }
        int l = 0;
        int ans = n;
        for(int r = 0; r < n; r++){
            count[index(s.charAt(r))]--;
            while(count[0] <= target && count[1] <= target && count[2] <= target && count[3] <= target){
                ans = Math.min(ans, r - l + 1);
                count[index(s.charAt(l))]++;
                l++;
            }
        }
        return ans;
    }

    private int index(Character c){
        return switch (c) {
            case 'Q' -> 0;
            case 'W' -> 1;
            case 'E' -> 2;
            default -> 3;
        };
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}