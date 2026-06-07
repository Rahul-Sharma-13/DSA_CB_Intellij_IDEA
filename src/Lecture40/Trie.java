package Lecture40;

import java.util.HashMap;

public class Trie {
    class Node{
        char ch;
        HashMap<Character, Node> child;
        boolean isTerminal;
        public Node(char ch){
            this.ch = ch;
            child = new HashMap<>();
        }
    }
    private Node root;
    public Trie(){
        root = new Node('*');
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else{
                Node node = new Node(ch);
                curr.child.put(ch, node);
                curr = node;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else{
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch= prefix.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}
