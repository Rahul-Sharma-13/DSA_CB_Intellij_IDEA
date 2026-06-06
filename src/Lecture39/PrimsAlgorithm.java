package Lecture39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public PrimsAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }
    public void PrimsAlgo(){
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b) -> a.cost - b.cost);
        pq.add(new PrimsPair(1, 1, 0));
        int sum = 0;
        while(!pq.isEmpty()){
//            1. remove
            PrimsPair pp = pq.poll();
//            2. ignore if already visited
            if(visited.contains(pp.vtx)){
                continue;
            }
//            3. mark visited
            visited.add(pp.vtx);
//            4. self work
//            System.out.println(pp);
            sum+= pp.cost;
//            5. add unvisited nbrs
            for(int nbrs: map.get(pp.vtx).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(pp.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs, pp.vtx, cost));
                }
            }
        }
        System.out.println(sum);
    }

    class PrimsPair{
        int vtx;
        int acqVtx;
        int cost;
        public PrimsPair(int vtx, int acqVtx, int cost){
            this.vtx = vtx;
            this.acqVtx = acqVtx;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return vtx + " " + acqVtx + " @ " + cost;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        PrimsAlgorithm pq = new PrimsAlgorithm(n);

        for (int i = 0; i < m; i++) {
            int v1 = input.nextInt();
            int v2 = input.nextInt();
            int cost = input.nextInt();
            pq.AddEdge(v1, v2, cost);
        }
        pq.PrimsAlgo();
    }
}
