package leetcode.editor.cn.Tree;

import java.util.ArrayList;
import java.util.List;

class P834SumOfDistancesInTree{
    public static void main(String[] args){
        Solution solution = new P834SumOfDistancesInTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int n;
    private List<Integer>[] graph;
    private int[] size;
    private int[] ans;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        graph = new ArrayList[n];
        size = new int[n];
        ans = new int[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // 第一次 DFS：
        // 1. 计算每个节点的子树大小 size[u]
        // 2. 计算 answer[0]
        dfs1(0, -1, 0);
        // 第二次 DFS：
        // 根据父节点答案推出子节点答案
        dfs2(0, -1);
        return ans;
    }

    private void dfs1(int u, int parent, int depth){
        // 自己也算在自己的子树中
        size[u] = 1;
        // 0 到 u 的距离就是 depth
        ans[0] += depth;

        for(int i : graph[u]){
            if(i == parent){
                continue;
            }
            dfs1(i, u, depth + 1);
            // 把孩子的子树大小加到自己身上
            size[u] += size[i];
        }
    }

    private void dfs2(int u, int parent){
        for(int i : graph[u]){
            if(i == parent){
                continue;
            }
            ans[i] = ans[u] - size[i] + (n - size[i]);
            dfs2(i, u);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}