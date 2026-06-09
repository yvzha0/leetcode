package leetcode.editor.cn.array;
class P1122RelativeSortArray{
    public static void main(String[] args){
        Solution solution = new P1122RelativeSortArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int a : arr1){
            count[a]++;
        }
        int i = 0;
        for(int a : arr2){
            for(int j = 0; j < count[a]; j++){
                arr1[i] = a;
                i++;
            }
            count[a] = 0;
        }
        for(int j = 0; j < 1001; j++){
            if(count[j] != 0){
                for(int k = 0; k < count[j]; k++){
                    arr1[i] = j;
                    i++;
                }
            }
        }
        return arr1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}