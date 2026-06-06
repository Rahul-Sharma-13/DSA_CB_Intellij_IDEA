package Lecture38GraphBipartite;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }
    public void BFT(){
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int src: map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
                //1. remove
                int r = q.poll();
                //2. Ignore if Already Visited
                if (visited.contains(r)) {
                    continue;
                }
                //3. Marked Visited
                visited.add(r);
                //4. self word
                System.out.print(r + " ");
                //5. add unvisited nbrs
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }

    public void DFT(){
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                continue;
            }
            //to count the number of components you just have to create a var count outside this loop and increment it every time the "src" is added to queue
            st.push(src);
            while (!st.isEmpty()) {
                //1. remove
                int r = st.pop();
                //2. Ignore if Already Visited
                if (visited.contains(r)) {
                    continue;
                }
                //3. Marked Visited
                visited.add(r);
                //4. self word
                System.out.print(r+" ");
                //5. add unvisited nbrs
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
        System.out.println();
    }

}
