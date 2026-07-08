package leetcode.editor.cn.array;
class P717OneBitAnd2BitCharacters{
    public static void main(String[] args){
        Solution solution = new P717OneBitAnd2BitCharacters().new Solution();
        solution.isOneBitCharacter(new int[] {1,1,1,1,1,1,0});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        for(; i < n - 1; i++){
            if(bits[i] == 1){
                i++;
            }
        }
        return i == n - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}