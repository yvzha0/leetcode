package leetcode.editor.cn.array;
class P1652DefuseTheBomb{
    public static void main(String[] args){
        Solution solution = new P1652DefuseTheBomb().new Solution();
        int[] a = {5,7,1,4};
        solution.decrypt(a,3);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        if (k == 0) {
            return new int[n];
        }

        int[] sums = new int[n];

        int left = k > 0 ? 1 : n + k;
        int right = k > 0 ? k : n - 1;

        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += code[i];
        }
        sums[0] = sum;

        for (int m = 1; m < n; m++) {
            right = (right + 1) % n;
            sum += code[right];
            sum -= code[left];
            left = (left + 1) % n;
            sums[m] = sum;
        }

        return sums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}