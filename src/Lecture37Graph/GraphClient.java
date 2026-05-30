package Lecture37Graph;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph gr = new Graph(7);
        gr.AddEdge(1,2, 3);
        gr.AddEdge(1,4, 7);
        gr.AddEdge(2,3, 1);
        gr.AddEdge(3,4, 6);
        gr.AddEdge(5,4, 2);
        gr.AddEdge(5,6, 4);
        gr.AddEdge(5,7, 3);
        gr.AddEdge(6,7, 1);
        gr.Display();
        System.out.println(gr.hasPath(1, 6, new HashSet<>()));
        gr.PrintAllPath(1, 6, new HashSet<>(), "");
    }
}
