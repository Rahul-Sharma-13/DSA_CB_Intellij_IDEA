package Lecture40;

import java.util.*;

public class TopologicalSort {
    private HashMap<Integer, List< Integer>> map;

    public TopologicalSort(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void AddEdge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    public int[] Indegree(){
        int[] in = new int[map.size()];
        for(int v:map.keySet()){
            for (int nbrs:map.get(v)){
                in[nbrs]++;
            }
        }
        return in;
    }

    public void Topology(){
        int[] in = Indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int v = q.remove();
            System.out.println(v+" ");
            for (int nbrs: map.get(v)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
    }
    public boolean isCycle(){
        int[] in = Indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while (!q.isEmpty()){
            int v = q.remove();
            count++;
            for (int nbrs: map.get(v)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        return count!= map.size();
    }

    public static void main(String[] args) {
        TopologicalSort ts = new TopologicalSort(8);
        ts.AddEdge(1, 2);
        ts.AddEdge(1, 0);
        ts.AddEdge(1, 4);
        ts.AddEdge(4, 3);
        ts.AddEdge(3, 2);
        ts.AddEdge(4, 5);
        ts.AddEdge(5, 7);
        ts.AddEdge(6, 3);
        ts.AddEdge(6, 7);
        ts.Topology();
    }
}
