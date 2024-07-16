package Tree;

public class prefixTrie {

    class TrieNode{
        TrieNode []children;
        boolean eow;

        public TrieNode(){
            this.children=new TrieNode[26];
            this.eow=false;
        }
    }

    public TrieNode root;
    public  prefixTrie(){
        this.root=new TrieNode();
    }

    public void insert(String word){
        TrieNode node=root;

        for (char c:word.toCharArray()) {
          int index=c - 'a';
          if (node.children[index]==null){
              node.children[index]=new TrieNode();
          }
          node=node.children[index];

        }
        node.eow=true;
    }

    public boolean search(String word){
        TrieNode node=searchprefix(word);
        return node != null && node.eow;
    }

    public boolean startsWith(String prefix){
        return searchprefix(prefix) != null;
    }
    private TrieNode searchprefix(String word) {
        TrieNode node=root;
        for (char c:word.toCharArray()) {
            int index=c - 'a';
            if (node.children[index]==null){
                return null;
            }
            node=node.children[index];
        }
        return node;
    }

    public static void main(String[] args) {
        prefixTrie trie=new prefixTrie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");

        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("c"));

    }
}
