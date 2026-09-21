package leetcode.editor.cn.Tree;

import leetcode.editor.cn.Node;

import java.util.ArrayList;
import java.util.List;

class P589NAryTreePreorderTraversal{
    public static void main(String[] args){
        Solution solution = new P589NAryTreePreorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
//    public List<Integer> preorder(Node root) {
//        List<Integer> ans = new ArrayList<>();
//        if(root == null){
//            return ans;
//        }
//        Deque<Node> stack = new ArrayDeque<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            Node node = stack.pop();
//            ans.add(node.val);
//            List<Node> children = node.children;
//            for(int i = children.size() - 1; i >= 0; i--){
//                stack.push(children.get(i));
//            }
//        }
//        return ans;
//    }

    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        ans.add(root.val);
        List<Node> children = root.children;
        for(Node child : children){
            preorder(child);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}