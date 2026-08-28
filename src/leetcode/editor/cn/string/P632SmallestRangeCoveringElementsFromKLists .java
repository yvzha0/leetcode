package leetcode.editor.cn.string;

import java.util.*;

class P632SmallestRangeCoveringElementsFromKLists{
    public static void main(String[] args){
        Solution solution = new P632SmallestRangeCoveringElementsFromKLists().new Solution();
        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(4, 10, 15, 24, 26),
                Arrays.asList(0, 9, 12, 20),
                Arrays.asList(5, 18, 22, 30)
        );
        solution.smallestRange(nums);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    class Node{
        int val;
        int numsIndex;
        int index;

        Node(int val, int numsIndex, int index){
            this.val = val;
            this.index = index;
            this.numsIndex = numsIndex;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++){
            List<Integer> num = nums.get(i);
            int val = num.get(0);
            minHeap.offer(new Node(val, i, 0));
            max = Math.max(max, val);
        }
        int[] ans = new int[] {minHeap.peek().val, max};

        while(true){
            Node minNode = minHeap.poll();
            int min = minNode.val;
            if(max - min < ans[1] - ans[0] || (max - min == ans[1] - ans[0] && min < ans[0])){
                ans[0] = min;
                ans[1] = max;
            }

            int listIndex = minNode.numsIndex;

            int nextIndex = minNode.index + 1;

            if (nextIndex == nums.get(listIndex).size()) {
                break;
            }
            int nextValue = nums.get(listIndex).get(nextIndex);

            minHeap.offer(new Node(nextValue, listIndex, nextIndex));

            // 更新最大值
            max = Math.max(max, nextValue);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}