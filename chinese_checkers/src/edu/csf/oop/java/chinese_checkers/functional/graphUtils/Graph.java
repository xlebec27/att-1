package edu.csf.oop.java.chinese_checkers.functional.graphUtils;

public interface Graph {

    int vertexCount();

    int edgeCount();

    void addEdge(int v1, int v2);

    void removeEdge(int v1, int v2);

    Iterable<Integer> adjacency(int v);

    default boolean isAdj(int v1, int v2) {
        for (Integer adj : adjacency(v1)) {
            if (adj == v2) {
                return true;
            }
        }
        return false;
    }

    boolean[][] getAdjMatrix();
}
