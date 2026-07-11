package leetcode.editor.cn.array;
class P605CanPlaceFlowers{
    public static void main(String[] args){
        Solution solution = new P605CanPlaceFlowers().new Solution();
        solution.canPlaceFlowers(new int[]{1,0,0,0,1},1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 若不需要种花，直接返回 true
        if (n <= 0) {
            return true;
        }

        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                // 虚拟边界处理：若为首位则左邻视为 0，若为末位则右邻视为 0
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == len - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; // 贪心放置
                    count++;

                    if (count >= n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}