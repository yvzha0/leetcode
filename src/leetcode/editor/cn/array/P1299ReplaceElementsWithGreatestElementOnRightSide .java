package leetcode.editor.cn.array;
class P1299ReplaceElementsWithGreatestElementOnRightSide{
    public static void main(String[] args){
        Solution solution = new P1299ReplaceElementsWithGreatestElementOnRightSide().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        arr[n - 1] = -1;
        for(int i = n - 2; i >= 0; i--){
            int a = arr[i];
            arr[i] = max;
            max = Math.max(a, max);
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}