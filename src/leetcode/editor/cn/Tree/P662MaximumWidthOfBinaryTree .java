package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.HashMap;
import java.util.Map;

class P662MaximumWidthOfBinaryTree{
    public static void main(String[] args){
        Solution solution = new P662MaximumWidthOfBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
//    public int widthOfBinaryTree(TreeNode root) {
//        int ans = 0;
//        Deque<Pair> queue = new ArrayDeque<>();
//        queue.offer(new Pair(root, 0));
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            int start = queue.peek().index;
//            for(int i = 0; i < size; i++){
//                Pair pair = queue.poll();
//                TreeNode node = pair.node;
//                int index = pair.index;
//                ans = Math.max(ans, index - start + 1);
//                if(node.left != null){
//                    queue.offer(new Pair(node.left, index * 2));
//                }
//                if(node.right != null){
//                    queue.offer(new Pair(node.right, index * 2 + 1));
//                }
//            }
//        }
//        return ans;
//    }
//
//    class Pair{
//        private final TreeNode node;
//        private final int index;
//
//        Pair(TreeNode node, int index){
//            this.node = node;
//            this.index = index;
//        }
//    }
    Map<Integer, Integer> map;
    public int widthOfBinaryTree(TreeNode root) {
        map = new HashMap<>();
        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode root, int depth, int index){
        if(root == null){
            return 0;
        }
        if(!map.containsKey(depth)){
            map.put(depth, index);
        }
        return Math.max(index - map.get(depth) + 1, Math.max(dfs(root.left, depth + 1, index * 2), dfs(root.right, depth + 1, index * 2 + 1)));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}