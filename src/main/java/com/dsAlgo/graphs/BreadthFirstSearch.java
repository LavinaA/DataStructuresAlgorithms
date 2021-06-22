package com.dsAlgo.graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {

        Graphs g1 = GraphClient.createGraph();
        bfsTraversal(g1);

    }

    private static void bfsTraversal (Graphs g){
        int[][] matrix = g.matrix;
        List<Vertex> list = g.list;

        Deque<Integer> queue = new LinkedList<>();
        queue.addLast(0);
        list.get(0).visited = true;

        while (!queue.isEmpty()) {

            Integer index = queue.removeFirst();
            System.out.print(list.get(index).i);
            System.out.println(" ");
            while(true){

              Integer adj = getAdjacentUnvisitedVertex(index,matrix,list) ;

                if (adj == null) {
                    break;
                }

                queue.addLast(adj);
                list.get(adj).visited = true;

            }
        }
    }

    private static Integer getAdjacentUnvisitedVertex(Integer i, int[][] matrix, List<Vertex> list) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 1 && list.get(j).visited == false) {
                return j;
            }
        }
        return null;
    }
}


