package leetcode.editor.cn.Stack;

class P341FlattenNestedListIterator{
    public static void main(String[] args){

    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
//public class NestedIterator implements Iterator<Integer> {
//    Deque<Integer> queue;
//    public NestedIterator(List<NestedInteger> nestedList) {
//        queue = new ArrayDeque<>();
//        f(nestedList);
//    }
//
//    private void f(List<NestedInteger> nestedList){
//        for(NestedInteger nes : nestedList){
//            if(nes.isInteger()){
//                queue.offer(nes.getInteger());
//            }else {
//                f(nes.getList());
//            }
//        }
//    }
//
//    @Override
//    public Integer next() {
//        return queue.poll();
//    }
//
//    @Override
//    public boolean hasNext() {
//        return !queue.isEmpty();
//    }
//}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
//leetcode submit region end(Prohibit modification and deletion)

}