package leetcode.editor.cn.TwoPointers;

import java.util.ArrayList;
import java.util.List;

class P986IntervalListIntersections{
    public static void main(String[] args){
        Solution solution = new P986IntervalListIntersections().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int m = firstList.length;
        int n = secondList.length;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            int left = Math.max(firstList[i][0], secondList[j][0]);
            int right = Math.min(firstList[i][1], secondList[j][1]);
            if(left <= right){
                ans.add(new int[]{left, right});
            }
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else {
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}