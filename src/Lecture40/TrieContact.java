package Lecture40;

import java.util.HashMap;

public class TrieContact {
//    https://www.hackerrank.com/challenges/ctci-contacts/problem
    class Node{
        char ch;
        HashMap<Character, Node> child;
        boolean isTerminal;
        int c = 1;
        public Node(char ch){
            this.ch = ch;
            child = new HashMap<>();
        }
    }
    private Node root;
    public TrieContact(){
        root = new Node('*');
    }
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
                curr.c++;
            }else{
                Node node = new Node(ch);
                curr.child.put(ch, node);
                curr = node;
            }
        }
        curr.isTerminal = true;
    }
    public int search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else{
                return 0;
            }
        }
        return curr.c;
    }
}
