package leetcode.editor.cn.Dynamic;

import java.util.ArrayDeque;
import java.util.Queue;

class P1654MinimumJumpsToReachHome{
    public static void main(String[] args){
        Solution solution = new P1654MinimumJumpsToReachHome().new Solution();
        solution.minimumJumps(new int[] {8,3,16,6,12,20}, 15, 13, 11);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int limit = x;
        for(int f : forbidden){
            limit = Math.max(limit, f);
        }
        limit += a + b;
        boolean[] banned = new boolean[limit + 1];
        for(int f : forbidden){
            banned[f] = true;
        }
        boolean[][] visited = new boolean[limit + 1][2];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0, 0});
        visited[0][0] = true;
        int step = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] state = queue.poll();
                int position = state[0];
                int isBack = state[1];
                if(position == x){
                    return step;
                }
                int next = position + a;
                if(next <= limit && !banned[next] && !visited[next][0]){
                    visited[next][0] = true;
                    queue.offer(new int[] {next, 0});
                }
                next = position - b;
                if(isBack == 0 && next >= 0 && !banned[next] && !visited[next][1]){
                    visited[next][1] = true;
                    queue.offer(new int[] {next, 1});
                }
            }
            step++;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}