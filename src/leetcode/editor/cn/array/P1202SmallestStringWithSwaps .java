package leetcode.editor.cn.array;

import java.util.*;

class P1202SmallestStringWithSwaps{
    public static void main(String[] args){
        Solution solution = new P1202SmallestStringWithSwaps().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int[] parent;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        parent = new int[n];

        // 1. 初始化并查集
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        // 2. 根据 pairs 合并连通分量
        for (List<Integer> pair : pairs) {
            union(pair.get(0), pair.get(1));
        }

        // 3. 将属于同一个连通分量的索引归类
        Map<Integer, List<Integer>> components = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            components.computeIfAbsent(root, k -> new ArrayList<>()).add(i);
        }

        // 4. 对每个连通分量内的字符进行排序并填回
        char[] res = s.toCharArray();
        for (List<Integer> indices : components.values()) {
            char[] chars = new char[indices.size()];
            for (int i = 0; i < indices.size(); i++) {
                chars[i] = s.charAt(indices.get(i));
            }

            // 对字符数组进行升序排序
            Arrays.sort(chars);

            // 将排序后的字符按顺序填回原索引位置
            for (int i = 0; i < indices.size(); i++) {
                res[indices.get(i)] = chars[i];
            }
        }

        return new String(res);
    }

    private int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    // 合并两个集合
    private void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}