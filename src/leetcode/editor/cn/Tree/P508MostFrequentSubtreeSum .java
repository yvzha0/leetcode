package leetcode.editor.cn.Tree;

import leetcode.editor.cn.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P508MostFrequentSubtreeSum{
    public static void main(String[] args){
        Solution solution = new P508MostFrequentSubtreeSum().new Solution();
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
    List<Integer> list;
    Map<Integer, Integer> map;
    int max;
    public int[] findFrequentTreeSum(TreeNode root) {
        list = new ArrayList<>();
        map = new HashMap<>();
        max = 1;
        dfs(root);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = dfs(root.left);
        int r = dfs(root.right);
        int sum = root.val + l + r;
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        if(count == max){
            list.add(sum);
        }else if(count > max){
            list.clear();
            max = count;
            list.add(sum);
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}