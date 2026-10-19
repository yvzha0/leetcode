package leetcode.editor.cn.TwoPointers;

class P287FindTheDuplicateNumber{
    public static void main(String[] args){
        Solution solution = new P287FindTheDuplicateNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        // 第一阶段：寻找环内相遇位置
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // 第二阶段：寻找环入口
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}