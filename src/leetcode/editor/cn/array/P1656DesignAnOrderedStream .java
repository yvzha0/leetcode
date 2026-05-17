package leetcode.editor.cn.array;

import java.util.ArrayList;
import java.util.List;

class P1656DesignAnOrderedStream{
    //leetcode submit region begin(Prohibit modification and deletion)
class OrderedStream {

    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        stream = new String[n+1];
        ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> res = new ArrayList<>();
        while(ptr < stream.length && stream[ptr] != null){
            res.add(stream[ptr]);
            ptr++;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
//leetcode submit region end(Prohibit modification and deletion)

}