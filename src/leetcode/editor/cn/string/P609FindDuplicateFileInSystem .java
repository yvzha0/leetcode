package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class P609FindDuplicateFileInSystem{
    public static void main(String[] args){
        Solution solution = new P609FindDuplicateFileInSystem().new Solution();
        solution.findDuplicate(new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String path : paths){
            String[] ss = path.split(" ");
            String dir = ss[0];
            for(int i = 1; i < ss.length; i++){
                int index = ss[i].indexOf('(');
                String file = ss[i].substring(0, index);
                String content = ss[i].substring(index + 1, ss[i].length() - 1);
                List<String> val = map.getOrDefault(content, new ArrayList<>());
                val.add(dir + '/' + file);
                map.put(content, val);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> val : map.values()){
            if(val.size() > 1){
                ans.add(val);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}