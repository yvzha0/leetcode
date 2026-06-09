package leetcode.editor.cn.array;
class P1089DuplicateZeros{
    public static void main(String[] args){
        Solution solution = new P1089DuplicateZeros().new Solution();
        solution.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int top = 0;
        int i = -1;
        while(top < n){
            i++;
            if(arr[i] == 0){
                top += 2;
            }else {
                top++;
            }
        }
        int index = n - 1;
        if(top > n){
            arr[n - 1] = 0;
            i--;
            index--;
        }
        while(i >= 0 && index >= 0){
            arr[index] = arr[i];
            index--;
            if(arr[i] == 0){
                arr[index] = arr[i];
                index--;
            }
            i--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}