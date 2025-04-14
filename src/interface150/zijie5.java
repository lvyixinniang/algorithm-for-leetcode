package interface150;

import java.util.ArrayList;
import java.util.List;

class TrieNode {
    int count; // 记录以当前节点结尾的单词数量
    int prefixCount; // 记录以当前节点为前缀的单词数量
    TrieNode[] children; // 子节点

    public TrieNode() {
        count = 0;
        prefixCount = 0;
        children = new TrieNode[26]; // 仅包含 'a' ~ 'z'
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // 插入单词
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
            node.prefixCount++; // 更新前缀数量
        }
        node.count++; // 更新单词数量
    }

    // 删除单词
    public void delete(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            node = node.children[index];
            node.prefixCount--; // 减少前缀数量
        }
        node.count--; // 减少单词数量
    }

    // 查询单词是否存在
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.count > 0; // 检查是否是一个完整的单词
    }

    // 查询以 pre 为前缀的单词数量
    public int prefixNumber(String pre) {
        TrieNode node = root;
        for (char c : pre.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return 0;
            }
            node = node.children[index];
        }
        return node.prefixCount; // 返回前缀数量
    }
}

public class zijie5 {
    public String[] trieU (String[][] operators) {
        Trie trie = new Trie();
        List<String> res = new ArrayList<>();
        for (String[] op : operators) {
            String operation = op[0];
            String word = op[1];
            switch (operation) {
                case "1":
                    trie.insert(word);
                    break;
                case "2":
                    trie.delete(word);
                    break;
                case "3":
                    res.add(trie.search(word) ? "YES" : "NO");
                    break;
                case "4":
                    res.add(String.valueOf(trie.prefixNumber(word)));
                    break;
                default:
                    break;
            }
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        zijie5 zijie5 = new zijie5();
        String[][] operators = {
                {"1", "apple"},
                {"1", "app"},
                {"3", "app"},
                {"4", "app"},
                {"2", "app"},
                {"3", "app"},
                {"4", "app"}
        };
        System.out.println(zijie5.trieU(operators));
    }
}