package leetcode.editor.cn.TwoPointers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class P632SmallestRangeCoveringElementsFromKLists{
    public static void main(String[] args){
        Solution solution = new P632SmallestRangeCoveringElementsFromKLists().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    class Node{
//        int val;
//        int listIndex;
//        int index;
//
//        Node(int val, int listIndex, int index) {
//            this.val = val;
//            this.listIndex = listIndex;
//            this.index = index;
//        }
//    }
//
//    public int[] smallestRange(List<List<Integer>> nums) {
//        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < nums.size(); i++){
//            List<Integer> list = nums.get(i);
//            minHeap.offer(new Node(list.get(0), i, 0));
//            max = Math.max(max, list.get(0));
//        }
//        int[] ans = new int[] {minHeap.peek().val, max};
//
//        while(true){
//            Node minNode = minHeap.poll();
//            int min = minNode.val;
//            if(max - min < ans[1] - ans[0] || (max - min == ans[1] - ans[0] && min < ans[0])){
//                ans[0] = min;
//                ans[1] = max;
//            }
//
//            int listIndex = minNode.listIndex;
//
//            int nextIndex = minNode.index + 1;
//
//            if(nextIndex == nums.get(listIndex).size()){
//                break;
//            }
//
//            int nextVal = nums.get(listIndex).get(nextIndex);
//
//            minHeap.offer(new Node(nextVal, listIndex, nextIndex));
//
//            max = Math.max(max, nextVal);
//        }
//
//        return ans;
//    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int k = nums.size();
        List<int[]> arrs = new ArrayList<>();
        for(int i = 0; i < k; i++){
            List<Integer> list = nums.get(i);
            for(int num : list){
                arrs.add(new int[] {num, i});
            }
        }
        arrs.sort(Comparator.comparingInt(a -> a[0]));

        int n = arrs.size();
        int[] ans = new int[] {arrs.get(0)[0], arrs.get(n - 1)[0]};

        int[] count = new int[k];
        int covered = 0;
        int l = 0;

        for (int[] arr : arrs) {
            int rIdx = arr[1];
            if (count[rIdx] == 0) {
                covered++;
            }
            count[rIdx]++;
            while (covered == k) {
                int lIdx = arrs.get(l)[1];
                if (count[lIdx] == 1) {
                    covered--;
                }
                count[lIdx]--;
                int min = arrs.get(l)[0];
                int max = arr[0];
                if (max - min < ans[1] - ans[0]) {
                    ans[0] = min;
                    ans[1] = max;
                }
                l++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}