package leetcode.editor.cn.array;

import java.util.*;

class P1337TheKWeakestRowsInAMatrix{
    public static void main(String[] args){
        Solution solution = new P1337TheKWeakestRowsInAMatrix().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        List<int[]> power = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            power.add(new int[]{getPower(mat[i]), i});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> {
            if (pair1[0] != pair2[0]) {
                return pair1[0] - pair2[0];
            } else {
                return pair1[1] - pair2[1];
            }
        });
        for (int[] pair : power) {
            pq.offer(pair);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = Objects.requireNonNull(pq.poll())[1];
        }
        return ans;

    }
    public int getPower(int[] a){
        int l = 0;
        int r = a.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(a[mid] == 0){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return r + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}