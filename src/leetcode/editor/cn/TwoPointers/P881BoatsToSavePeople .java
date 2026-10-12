package leetcode.editor.cn.TwoPointers;

import java.util.Arrays;

class P881BoatsToSavePeople{
    public static void main(String[] args){
        Solution solution = new P881BoatsToSavePeople().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans = 0;
        int n = people.length;
        int l = 0;
        int r = n - 1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l++;
            }
            r--;
            ans++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}