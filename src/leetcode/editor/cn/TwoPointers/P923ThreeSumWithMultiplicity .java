package leetcode.editor.cn.TwoPointers;

import java.util.Arrays;

class P923ThreeSumWithMultiplicity{
    public static void main(String[] args){
        Solution solution = new P923ThreeSumWithMultiplicity().new Solution();
        solution.threeSumMulti(new int[] {1,1,2,2,3,3,4,4,5,5}, 8);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int ans = 0;
        int mod = 1000000007;
        int n = arr.length;
        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                if(arr[i] + arr[left] + arr[right] == target){
                    int lCount = 1;
                    int rCount = 1;
                    while(left < n - 1 && arr[left + 1] == arr[left]){
                        left++;
                        lCount++;
                    }
                    if(arr[left] == arr[right]){
                        ans = (ans + lCount * (lCount - 1) / 2) % mod;
                        continue;
                    }
                    while(right > 0 && arr[right - 1] == arr[right]){
                        right--;
                        rCount++;
                    }
                    ans = (ans + lCount * rCount) % mod;
                    left++;
                    right--;
                }else if(arr[i] + arr[left] + arr[right] < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}