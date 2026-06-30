package leetcode.editor.cn.array;
class P832FlippingAnImage{
    public static void main(String[] args){
        Solution solution = new P832FlippingAnImage().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++){
            int l = 0;
            int r = n - 1;
            while(l < r){
                int tmp = image[i][l] ^ 1;
                image[i][l] = image[i][r] ^ 1;
                image[i][r] = tmp;
                l++;
                r--;
            }
            if(l == r){
                image[i][l] ^= 1;
            }
        }
        return image;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}