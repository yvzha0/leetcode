package leetcode.editor.cn.array;

class P914XOfAKindInADeckOfCards{
    public static void main(String[] args){
        Solution solution = new P914XOfAKindInADeckOfCards().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] counts = new int[10000];
        for(int d : deck){
            counts[d]++;
        }
        int g = -1;
        for(int count : counts){
            if(count > 0){
                if(g == -1){
                    g = count;
                }else {
                    g = gcd(g, count);
                }
                if(g < 2){
                    return false;
                }
            }
        }
        return true;
    }

    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}