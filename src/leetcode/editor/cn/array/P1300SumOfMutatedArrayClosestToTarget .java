package leetcode.editor.cn.array;

import java.util.Arrays;

class P1300SumOfMutatedArrayClosestToTarget{
    public static void main(String[] args){
        Solution solution = new P1300SumOfMutatedArrayClosestToTarget().new Solution();
        solution.findBestValue(new int[]{2,3,5},10);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int findBestValue(int[] arr, int target) {
        // 主流程第一步：依然是经典的排序与前缀和预处理
        Arrays.sort(arr);
        int n = arr.length;
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + arr[i];
        }

        // 外层二分：在 [0, max(arr)] 之间二分查找最佳的 value
        int l = 0;
        int r = arr[n - 1];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // 步骤 1：传入 preSum 数组进行 O(log n) 的快速求和
            int sum = getMutatedSum(arr, preSum, mid);

            if (sum < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // 终局决选：平局点一挑一
        int sumL = getMutatedSum(arr, preSum, l);
        int sumR = getMutatedSum(arr, preSum, r);

        if (Math.abs(sumL - target) < Math.abs(sumR - target)) {
            return l;
        } else {
            return r;
        }
    }

    // 进化后的核心求和函数：时间复杂度由 O(n) 降为 O(log n)
    private int getMutatedSum(int[] arr, int[] preSum, int value) {
        int n = arr.length;

        // 步骤 2：用内层二分查找定位分水岭
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= value) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        int index = r; // 此时 index 是最后一个小于等于 value 的元素下标

        // 步骤 3：特判全盘裁剪的情况
        if (index < 0) {
            return value * n;
        }

        // 步骤 4 & 5：左边查前缀和，右边用乘法平铺，无缝组合
        return preSum[index + 1] + value * (n - index - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}