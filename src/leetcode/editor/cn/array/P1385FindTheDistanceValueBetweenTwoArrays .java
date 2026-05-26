package leetcode.editor.cn.array;

import java.util.Arrays;

class P1385FindTheDistanceValueBetweenTwoArrays{
    public static void main(String[] args){
        Solution solution = new P1385FindTheDistanceValueBetweenTwoArrays().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);
        for(int x : arr1){
            if(isZoneEmpty(arr2, x, d)){
                ans++;
            }
        }
        return ans;
    }

    public boolean isZoneEmpty(int[] arr, int x, int d){
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            int y = arr[mid];
            if(y >= x - d && y <= x + d){
                return false;
            }
            if(y < x - d){
                l = mid + 1;
            }
            if(y > x + d){
                r = mid - 1;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}