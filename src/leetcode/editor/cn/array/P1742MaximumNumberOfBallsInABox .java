package leetcode.editor.cn.array;

class P1742MaximumNumberOfBallsInABox{
    public static void main(String[] args){
        Solution solution = new P1742MaximumNumberOfBallsInABox().new Solution();
        solution.countBalls(11,104);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countBalls(int lowLimit, int highLimit) {
            int ans = 0;
            int[] count = new int[46];

            int sum = sum(lowLimit);

            while (lowLimit <= highLimit) {
                // 放入对应的盒子
                count[sum]++;
                ans = Math.max(ans, count[sum]);

                lowLimit++;

                // 【核心加速】如果下一个球的个位数不是 0，说明没有发生十位进位
                // 它的数字和仅仅比前一个球多 1，直接 sum++ 即可！
                if (lowLimit % 10 != 0) {
                    sum++;
                } else {
                    // 只有当个位逢十进位了，才重新调用复杂的求和函数
                    sum = sum(lowLimit);
                }
            }
            return ans;
        }

        public int sum(int num) {
            int res = 0;
            while (num > 0) {
                res += num % 10;
                num = num / 10;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}