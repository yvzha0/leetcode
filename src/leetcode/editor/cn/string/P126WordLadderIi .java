package leetcode.editor.cn.string;

import java.util.*;

class P126WordLadderIi{
    public static void main(String[] args){
        Solution solution = new P126WordLadderIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return new ArrayList<>();
        }
        wordSet.remove(beginWord);

        // ========================================
        // 第一步：BFS 构建父节点 map
        // ========================================
        Map<String, List<String>> parents = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        boolean found = false;

        while (!queue.isEmpty() && !found) {
            Set<String> layerWords = new HashSet<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] chars = word.toCharArray();

                for (int j = 0; j < chars.length; j++) {
                    char orig = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == orig) continue;
                        chars[j] = c;
                        String nextWord = new String(chars);

                        if (wordSet.contains(nextWord)) {
                            // 【反向建图】
                            parents.computeIfAbsent(nextWord, k -> new ArrayList<>()).add(word);
                            layerWords.add(nextWord);
                            if (nextWord.equals(endWord)) {
                                found = true;
                            }
                        }
                    }
                    chars[j] = orig;
                }
            }

            // 当前层处理完毕，从 wordSet 中移除
            wordSet.removeAll(layerWords);
            for (String w : layerWords) {
                queue.offer(w);
            }
        }

        // ========================================
        // 第二步：从 endWord 反向 DFS
        // ========================================
        List<List<String>> result = new ArrayList<>();
        if (found) {
            List<String> path = new ArrayList<>();
            path.add(endWord);
            dfs(endWord, beginWord, parents, path, result);
        }
        return result;
    }

    private void dfs(String word, String beginWord, Map<String, List<String>> parents,
                     List<String> path, List<List<String>> result) {
        if (word.equals(beginWord)) {
            // 反转路径（因为是从 endWord 往回走的）
            List<String> forwardPath = new ArrayList<>(path);
            Collections.reverse(forwardPath);
            result.add(forwardPath);
            return;
        }

        List<String> parentList = parents.get(word);
        if (parentList == null) return;

        for (String parent : parentList) {
            path.add(parent);
            dfs(parent, beginWord, parents, path, result);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}