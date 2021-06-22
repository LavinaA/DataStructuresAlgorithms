package com.dsAlgo.graphs;

public class GraphClient {

    public static void main(String[] args) {

        Graphs graph = createGraph();
        graph.displayGraph();

    }

    public static Graphs createGraph()
    {
        Graphs g = new Graphs(4);


        Vertex v1 = new Vertex(10);
        Vertex v2 = new Vertex(20);
        Vertex v3 = new Vertex(30);
        Vertex v4 = new Vertex(40);


        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(3,2);


        return g;
    }

}
