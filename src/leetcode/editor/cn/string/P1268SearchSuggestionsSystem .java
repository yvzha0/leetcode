package leetcode.editor.cn.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class P1268SearchSuggestionsSystem{
    public static void main(String[] args){
        Solution solution = new P1268SearchSuggestionsSystem().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    static class TrieNode {
//        TrieNode[] children = new TrieNode[26];
//        List<String> suggestions = new ArrayList<>();
//    }
//
//    TrieNode root = new TrieNode();
//
//    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
//        List<List<String>> ans = new ArrayList<>();
//        Arrays.sort(products);
//        for(String product : products){
//            insert(product);
//        }
//        TrieNode node = root;
//        for(char c : searchWord.toCharArray()){
//            if(node == null){
//                ans.add(new ArrayList<>());
//                continue;
//            }
//
//            int index = c - 'a';
//            node = node.children[index];
//            if(node == null){
//                ans.add(new ArrayList<>());
//            }else {
//                ans.add(new ArrayList<>(node.suggestions));
//            }
//        }
//        return ans;
//    }
//
//    private void insert(String word){
//        TrieNode node = root;
//
//        for(char c : word.toCharArray()){
//            int index = c - 'a';
//
//            if(node.children[index] == null){
//                node.children[index] = new TrieNode();
//            }
//            node = node.children[index];
//
//            if(node.suggestions.size() < 3){
//                node.suggestions.add(word);
//            }
//        }
//    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);
        for(int i = 1; i <= searchWord.length(); i++){
            String pre = searchWord.substring(0, i);
            int l = 0;
            int r = products.length;
            while(l < r){
                int mid = l + (r - l) / 2;
                if(products[mid].compareTo(pre) >= 0){
                    r = mid;
                }else {
                    l = mid + 1;
                }
            }
            List<String> list = new ArrayList<>();
            for (int j = l; j < products.length && list.size() < 3; j++) {
                if (products[j].startsWith(pre)) {
                    list.add(products[j]);
                } else {
                    break;
                }
            }

            ans.add(list);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}