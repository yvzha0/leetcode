package leetcode.editor.cn.array;

import java.util.LinkedList;

class P695MaxAreaOfIsland{
    public static void main(String[] args){
        Solution solution = new P695MaxAreaOfIsland().new Solution();
        solution.maxAreaOfIsland(new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        });
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int[][] visited = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && visited[i][j] != 1){
                    ans = Math.max(ans, dfs(grid, i, j, visited));
                }
            }
        }
        return ans;
    }

    private int bfs(int[][] grid, int i, int j, int[][] visited){
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = 1;
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        while(!queue.isEmpty()){
            int[] a = queue.poll();
            res++;
            for(int[] dir : dirs){
                i = a[0] + dir[0];
                j = a[1] + dir[1];
                if(i >= 0 && i < m && j >= 0 && j < n && visited[i][j] != 1 && grid[i][j] == 1){
                    queue.offer(new int[] {i, j});
                    visited[i][j] = 1;
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j, int[][] visited){
        int m = grid.length;
        int n = grid[0].length;
        visited[i][j] = 1;
        int res = 1;
        for(int[] dir : dirs){
            int nexti = i + dir[0];
            int nextj = j + dir[1];
            if(nexti >= 0 && nexti < m && nextj >= 0 && nextj < n && visited[nexti][nextj] != 1 && grid[nexti][nextj] == 1){
                res += dfs(grid, nexti, nextj, visited);
            }
        }
        return res;
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}