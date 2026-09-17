package leetcode.editor.cn.Tree;
class P685RedundantConnectionIi{
    public static void main(String[] args){
        Solution solution = new P685RedundantConnectionIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[] father = new int[n + 1];

        int[] candidate1 = null;
        int[] candidate2 = null;

        for(int[] edge : edges){
            if(father[edge[1]] == 0){
                father[edge[1]] = edge[0];
            }else {
                candidate1 = new int[] {father[edge[1]], edge[1]};
                candidate2 = edge;
                break;
            }
        }
        int[] parent = new int[n + 1];
        for(int i = 1; i <= n; i++){
            parent[i] = i;
        }
        for(int[] edge : edges){
            if(candidate2 != null && edge == candidate2){
                continue;
            }
            int a = edge[0];
            int b = edge[1];
            int rootA = find(parent, a);
            int rootB = find(parent, b);
            if(rootA == rootB){
                if(candidate1 == null){
                    return edge;
                }
                return candidate1;
            }
            parent[rootA] = rootB;
        }
        return candidate2;
    }

    private int find(int[] parent, int x){
        if(parent[x] != x){
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}