package com.dsAlgo.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {

        Graphs g1 = GraphClient.createGraph();
        dfsTraversal(g1);

    }

    private static void dfsTraversal(Graphs g) {
        int[][] matrix = g.matrix;
        List<Vertex> list = g.list;

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        list.get(0).visited = true;
        System.out.println(list.get(0).i);

        while(!stack.isEmpty()){

            Integer index = stack.peek();
            Integer adj = getAdjacentUnvisitedVertex(index,matrix,list) ;
            if (adj == null) {
                stack.pop();
            }
            else{
                list.get(adj).visited = true;
                System.out.println(list.get(adj).i);
                stack.push(adj);
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

