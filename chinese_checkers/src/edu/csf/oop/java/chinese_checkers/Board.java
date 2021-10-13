package edu.csf.oop.java.chinese_checkers;

import edu.csf.oop.java.chinese_checkers.functional.graphUtils.Graph;
import edu.csf.oop.java.chinese_checkers.functional.graphUtils.Vertex;

import java.util.ArrayList;

public class Board {

    final int rows = 17;
    final int cols = 17;
    private Graph checkers;
    private ArrayList<Vertex> vertices = new ArrayList<Vertex>();

    public Board(Graph checkers){
        this.checkers = checkers;
    }

    public void setChecker(int vertexIndex, Checker checker){
        vertices.get(vertexIndex).setChecker(checker);
    }

    public Checker getChecker(int vertexIndex){
        Checker checker = vertices.get(vertexIndex).getChecker();
        vertices.get(vertexIndex).setChecker(null);
        return checker;
    }

    public Checker checkChecker(int vertexIndex){
        return vertices.get(vertexIndex).getChecker();
    }

}
