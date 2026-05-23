package leetcode.editor.cn.array;
class P1437CheckIfAll1sAreAtLeastLengthKPlacesAway{
    public static void main(String[] args){
        Solution solution = new P1437CheckIfAll1sAreAtLeastLengthKPlacesAway().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int lastSeen = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if (lastSeen != -1) {
                    if (i - lastSeen - 1 < k) {
                        return false;
                    }
                }
                lastSeen = i;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}