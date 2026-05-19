package leetcode.editor.cn.array;
class P1539KthMissingPositiveNumber{
    public static void main(String[] args){
        Solution solution = new P1539KthMissingPositiveNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        // 二分查找：寻找第一个缺失数字个数大于或等于 k 的位置
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 计算在 arr[mid] 之前总共缺失了多少个正整数
            int missingCount = arr[mid] - (mid + 1);

            if (missingCount < k) {
                // 缺失得还不够，目标在右边
                left = mid + 1;
            } else {
                // 缺失过多或刚好，向左收缩边界寻找第一个触发点
                right = mid - 1;
            }
        }

        // 核心数学推导结论：最终结果固定为 left + k
        return left + k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}