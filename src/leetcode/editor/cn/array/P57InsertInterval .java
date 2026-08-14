package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P57InsertInterval{
    public static void main(String[] args){
        Solution solution = new P57InsertInterval().new Solution();
        solution.insert(new int[][]{
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        }, new int[]{4, 8});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int l = newInterval[0];
        int r = newInterval[1];
        List<int[]> ansList = new ArrayList<>();
        int index = 0;
        int n = intervals.length;
        while(index < n && intervals[index][1] < l){
            ansList.add(intervals[index]);
            index++;
        }
        while(index < n && intervals[index][0] <= r){
            l = Math.min(l, intervals[index][0]);
            r = Math.max(r, intervals[index][1]);
            index++;
        }
        ansList.add(new int[]{l, r});
        while(index < n && intervals[index][0] > r){
            ansList.add(intervals[index]);
            index++;
        }
        int[][] ans = new int[ansList.size()][2];
        for(int i = 0; i < ans.length; i++){
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}