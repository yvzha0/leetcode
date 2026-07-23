package leetcode.editor.cn.array;

class P189RotateArray{
    public static void main(String[] args){
        Solution solution = new P189RotateArray().new Solution();
        solution.rotate(new int[] {-1, -100, 3, 99}, 2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k %= n;
//        if(k == 0){
//            return;
//        }
//        int count = 0;
//        for(int start = 0; count < n; start++){
//            int current = start;
//            int pre = nums[start];
//            do{
//                int next = (current + k) % n;
//                int temp = nums[next];
//                nums[next] = pre;
//                pre = temp;
//                current = next;
//                count++;
//            }while (start != current);
//        }
//    }
//
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;
//        int[] ans = new int[n];
//        for(int i = 0; i < n; i++){
//            ans[(i + k) % n] = nums[i];
//        }
//        System.arraycopy(ans, 0, nums, 0, n);
//    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // 1. 前置取模与快速剪枝
        k %= n;
        if (k == 0) {
            return;
        }

        // 2. 三次局部翻转实现 O(1) 空间原地轮转
        reverse(nums, 0, n - 1); // 翻转整个数组
        reverse(nums, 0, k - 1); // 翻转前 k 个元素
        reverse(nums, k, n - 1); // 翻转剩余元素
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}