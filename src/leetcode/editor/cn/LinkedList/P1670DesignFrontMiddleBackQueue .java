package leetcode.editor.cn.LinkedList;
class P1670DesignFrontMiddleBackQueue{
    public static void main(String[] args){

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class FrontMiddleBackQueue {
    private ListNode head;
    private ListNode tail;
    // mid 始终指向“偏前的中间节点”
    // 例如长度 4: [1, 2, 3, 4]，mid 指向 2
    // 长度 5: [1, 2, 3, 4, 5]，mid 指向 3
    private ListNode mid;
    private int size;

    public FrontMiddleBackQueue() {
        head = new ListNode();
        tail = new ListNode();
        head.next = tail;
        tail.pre = head;
        mid = null;
        size = 0;
    }
    
    public void pushFront(int val) {
        ListNode node = new ListNode(val);
        insertAfter(head, node);
        if(size == 0){
            mid = node;
        }else if (size % 2 == 1){
            mid = mid.pre;
        }
        size++;
    }
    
    public void pushMiddle(int val) {
        ListNode node = new ListNode(val);
        if(size == 0){
            insertAfter(head, node);
        }else {
            if(size % 2 == 0){
                insertAfter(mid, node);
            }else {
                insertAfter(mid.pre, node);
            }
        }
        mid = node;
        size++;
    }
    
    public void pushBack(int val) {
        ListNode node = new ListNode(val);
        insertAfter(tail.pre, node);
        if(size == 0){
            mid = node;
        }else if (size % 2 == 0){
            mid = mid.next;
        }
        size++;
    }
    
    public int popFront() {
        if(size == 0){
            return -1;
        }
        int val = head.next.val;
        if(size == 1){
            mid = null;
        }else if(size % 2 == 0){
            mid = mid.next;
        }
        remove(head.next);
        size--;
        return val;
    }

    public int popMiddle() {
        if(size == 0){
            return -1;
        }
        ListNode temp = mid;
        if(size == 1){
            mid = null;
        }else if(size % 2 == 0){
            mid = mid.next;
        }else {
            mid = mid.pre;
        }
        remove(temp);
        size--;
        return temp.val;
    }

    public int popBack() {
        if(size == 0){
            return -1;
        }
        int val = tail.pre.val;
        if(size == 1){
            mid = null;
        }else if(size % 2 == 1){
            mid = mid.pre;
        }
        remove(tail.pre);
        size--;
        return val;
    }

    private void insertAfter(ListNode cur, ListNode node) {
        node.pre = cur;
        node.next = cur.next;

        cur.next.pre = node;
        cur.next = node;
    }

    private void remove(ListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;

        node.pre = null;
        node.next = null;
    }

    class ListNode {
        private int val;
        private ListNode next;
        private ListNode pre;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */
//leetcode submit region end(Prohibit modification and deletion)

}