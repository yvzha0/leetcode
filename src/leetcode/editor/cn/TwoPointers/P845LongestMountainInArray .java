package leetcode.editor.cn.TwoPointers;
class P845LongestMountainInArray{
    public static void main(String[] args){
        Solution solution = new P845LongestMountainInArray().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int up = 0;
        int down = 0;
        for(int i = 0; i < n - 1; i++){
            if(down > 0 && arr[i + 1] > arr[i] || arr[i + 1] == arr[i]){
                down = 0;
                up = 0;
            }
            if(arr[i + 1] > arr[i]){
                up++;
            }else if(arr[i + 1] < arr[i]){
                down++;
            }

            if(up > 0 && down > 0){
                ans = Math.max(ans, up + down + 1);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}