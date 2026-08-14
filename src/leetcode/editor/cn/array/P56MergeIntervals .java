package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class P56MergeIntervals{
    public static void main(String[] args){
        Solution solution = new P56MergeIntervals().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ansList = new ArrayList<>();
        ansList.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] a = ansList.get(ansList.size() - 1);
            int[] b = intervals[i];
            if(a[1] < b[0]){
                ansList.add(b);
            }else {
                a[0] = Math.min(a[0], b[0]);
                a[1] = Math.max(a[1], b[1]);
            }
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