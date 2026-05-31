package Lecture38Graph;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
//    acyclic graph is always bipartite
//    odd cycle-> not bipartite
//    even cycle-> bipartite
//    https://leetcode.com/problems/is-graph-bipartite/
    class Solution{
        public boolean isBipartite(int[][] graph){
            HashMap<Integer, Integer> visited = new HashMap<>();
            Queue<BipartitePair> q = new LinkedList<>();
            for (int src = 0; src < graph.length; src++) {
                if(visited.containsKey(src)){
                    continue;
                }
                q.add(new BipartitePair(src, 0));
                while (!q.isEmpty()){
//                    1. remove
                    BipartitePair rp = q.poll();
//                    2. Ignore
                    if(visited.containsKey(rp.vtx)){
                        if(visited.get(rp.vtx) != rp.dis){
                            return false;
                        }
                        continue;
                    }
//                    3. Visited
                    visited.put(rp.vtx, rp.dis);
//                    4. self work
//                    5. add unvisited nbrs
                    for(int nbrs: graph[rp.vtx]){
                        if(!visited.containsKey(nbrs)){
                            q.add(new BipartitePair(nbrs, rp.dis +1));
                        }
                    }
                }
            }
            return true;
        }
    }
    class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }


}
