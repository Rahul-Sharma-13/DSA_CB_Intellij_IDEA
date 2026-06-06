package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    class Graph{
        private HashMap<Integer, HashMap<Integer, Integer>> map;
        public Graph(int v){
            map = new HashMap<>();
            for (int i = 1; i <= v; i++) {
                map.put(i, new HashMap<>());
            }
        }
        public boolean bfs(int src, int des, HashSet<Integer> visited){
            visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();
            q.add(src);

            while(!q.isEmpty()){
                // 1. Remove
                int x = q.poll();
                // 2. Ignore
                if(visited.contains(x)){
                    continue;
                }
                // 3. Mark Visited
                visited.add(x);
                // 4. self work
                if(x == des){
                    return true;
                }
                // 5. visit unvisited nbrs
                for (int nbrs: map.get(x).keySet()){
                    if(!visited.contains(nbrs)){
                        q.add(x);
                    }
                }
            }
            return false;
        }
    }
}
