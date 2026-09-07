package leetcode.editor.cn.Tree;

import java.util.*;

class P1600ThroneInheritance{
    public static void main(String[] args){

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class ThroneInheritance {
    Map<String, List<String>> home = new HashMap<>();
    Set<String> dead = new HashSet<>();
    private String kingName;
    public ThroneInheritance(String kingName) {
        home.put(kingName, new ArrayList<>());
        this.kingName = kingName;
    }
    
    public void birth(String parentName, String childName) {
        home.get(parentName).add(childName);
        home.put(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        dfs(kingName, ans);
        return ans;
    }

    private void dfs(String name, List<String> ans){
        if(!dead.contains(name)){
            ans.add(name);
        }
        List<String> children = home.get(name);
        for(String child : children){
            dfs(child, ans);
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */
//leetcode submit region end(Prohibit modification and deletion)

}