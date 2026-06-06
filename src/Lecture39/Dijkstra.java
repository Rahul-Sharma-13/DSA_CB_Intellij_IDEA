package Lecture39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }
    public void DijkstraAlgo(int src){
        PriorityQueue<DJPair> pq = new PriorityQueue<>((a, b)->a.cost-b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DJPair(src, "" + src, 0));
        while(!pq.isEmpty()){
//            remove
            DJPair rp = pq.poll();
//            ignore
            if(visited.contains(rp.vtx)){
                continue;
            }
//            marked visited
            visited.add(rp.vtx);
//            self work
            System.out.println(rp);
//            add unvisited nbrs
            for(int nbrs:map.get(rp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DJPair(nbrs, rp.acqPath+nbrs, rp.cost+cost));
                }
            }
        }
    }
    class DJPair{
        int vtx;
        String acqPath;
        int cost;
        public DJPair(int vtx, String acqPath, int cost){
            this.vtx = vtx;
            this.acqPath = acqPath;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return vtx + " " + acqPath + " @ " + cost;
        }

    }
    public static void main(String[] args) {
        Dijkstra dj = new Dijkstra(7);
        dj.AddEdge(1, 2, 2);
        dj.AddEdge(2, 3, 3);
        dj.AddEdge(1, 4, 10);
        dj.AddEdge(4, 5, 8);
        dj.AddEdge(3, 4, 1);
        dj.AddEdge(5, 6, 5);
        dj.AddEdge(5, 7, 6);
        dj.AddEdge(6, 7, 4);
        dj.DijkstraAlgo(1);
    }
}
