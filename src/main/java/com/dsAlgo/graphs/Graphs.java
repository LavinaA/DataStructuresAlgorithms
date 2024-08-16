package com.dsAlgo.graphs;


import java.util.ArrayList;
import java.util.List;

public class Graphs {


    int matrix [][];
    List<Vertex> list = new ArrayList<>();

    public Graphs(int n){
        matrix = new int[n][n];
    }

    public void addEdge ( int i, int j){

        matrix[i][j] = 1;
        matrix[j][i] = 1;

    }
    public  void addVertex (Vertex v){
        list.add(v);
    }

    public void displayGraph(){
        System.out.println("***********Adjacency List*******************");
        for (Vertex v:list) {
            System.out.println("Vertex numbers - > " +v.i);
        }
        System.out.println("***********Adjacency Matrix*******************");
        for(int i = 0 ;i <matrix.length;i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

}

