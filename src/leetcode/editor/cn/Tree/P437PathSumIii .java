package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.HashMap;
import java.util.Map;

class P437PathSumIii{
    public static void main(String[] args){
        Solution solution = new P437PathSumIii().new Solution();
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
//    public int pathSum(TreeNode root, int targetSum) {
//        if(root == null){
//            return 0;
//        }
//        int ans = dfs(root, targetSum);
//        ans += pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
//        return ans;
//    }
//
//    private int dfs(TreeNode root, long targetSum){
//        if(root == null){
//            return 0;
//        }
//        int count = 0;
//        if(root.val == targetSum){
//            count++;
//        }
//        count += dfs(root.left, targetSum - root.val);
//        count += dfs(root.right, targetSum - root.val);
//        return count;
//    }
    Map<Long, Integer> map;
    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        map.put(0L, 1);
        return dfs(root, 0L, targetSum);
    }

    private int dfs(TreeNode root, long curSum, int targetSum){
        if(root == null){
            return 0;
        }
        curSum += root.val;
        int count = map.getOrDefault(curSum - targetSum, 0);
        map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        count += dfs(root.left, curSum, targetSum);
        count += dfs(root.right, curSum, targetSum);
        map.put(curSum, map.get(curSum) - 1);
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}