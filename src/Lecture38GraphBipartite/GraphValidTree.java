package Lecture38GraphBipartite;

import java.util.*;

public class GraphValidTree {
    //    to check whether a graph is a tree
//    condition to check if a graph is a tree
//    1. the graph should be acyclic
//    2. the graph should
//    https://leetcode.ca/all/261.html
    class Solution {
        public void validTree(int n, int[][] edges) {
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(i, new ArrayList<>());
            }

            for (int i = 0; i < edges.length; i++) {
                int a = edges[i][0];
                int b = edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }
            System.out.println(BFT(map));
        }

    }
    public boolean BFT(HashMap<Integer, List<Integer>> map){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int c = 0;
        for(int src: map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            c++;
            q.add(src);
            while (!q.isEmpty()) {
                //1. remove
                int r = q.poll();
                //2. Ignore if Already Visited
                if (visited.contains(r)) {
                    return false;
                }
                //3. Marked Visited
                //4. self word
                System.out.print(r + " ");
                //5. add unvisited nbrs
                for (int nbrs : map.get(r)) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return c==1;
    }

}
