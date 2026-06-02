package leetcode.editor.cn.array;
class P1287ElementAppearingMoreThan25InSortedArray{
    public static void main(String[] args){
        Solution solution = new P1287ElementAppearingMoreThan25InSortedArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findSpecialInteger(int[] arr) {
        int num = arr[0];
        int n = arr.length / 4;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }else {
                num = arr[i];
                count = 1;
            }
            if(count > n){
                return num;
            }
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}