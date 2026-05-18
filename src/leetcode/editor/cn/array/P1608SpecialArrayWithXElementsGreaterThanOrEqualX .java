package leetcode.editor.cn.array;

class P1608SpecialArrayWithXElementsGreaterThanOrEqualX{
    public static void main(String[] args){
        Solution solution = new P1608SpecialArrayWithXElementsGreaterThanOrEqualX().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[Math.min(num, n)]++;
        }

        int totalElements = 0;
        for (int x = n; x >= 1; x--) {
            totalElements += count[x];

            if (totalElements == x) {
                return x;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}