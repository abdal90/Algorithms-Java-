import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    //BFS is used to find the shortest path

    // using an adjacency list
    // declare properties
    private int vertices; // number of vertices
    private LinkedList<Integer> adj[]; // declare adjaceny list using a linkedlist

    // constructor
    public BreadthFirstSearch(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        // create new adjacency list
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // add edges to graph
    public void addEdge(int source, int destination){
        adj[source].add(destination);
    }

    // BFS TRAVESAL
    public void BFS(int source){
        // mark all vertices as not visited by default
        boolean visited[] = new boolean[vertices];

        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();

        //add root node
        queue.add(source);
        //mark it as visited
        visited[source] = true;

        // loop through the entire search
        while (!queue.isEmpty()){
            // removes the element at the front the container (use queue.poll)
            source = queue.poll();

            // print it
            System.out.print(source + "");

            // Get all adjacent vertices of the dequeue vertex source
            for (Integer node : adj[source]) {
                // If a adjacent has not been visited
                if (!visited[node]) {
                    // add it to the queue
                    queue.add(node);
                    //then mark it visited and enqueue it
                    visited[node] = true;
                }
            }

        }
    }


    public static void main(String[] args) {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(4);

        breadthFirstSearch.addEdge(0, 1);
        breadthFirstSearch.addEdge(0, 2);
        breadthFirstSearch.addEdge(1, 2);
        breadthFirstSearch.addEdge(2, 0);
        breadthFirstSearch.addEdge(2, 3);
        breadthFirstSearch.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        // chose a source
        breadthFirstSearch.BFS(2);
    }
}



