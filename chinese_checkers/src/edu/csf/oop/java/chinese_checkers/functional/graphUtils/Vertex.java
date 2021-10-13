package edu.csf.oop.java.chinese_checkers.functional.graphUtils;

import edu.csf.oop.java.chinese_checkers.Checker;

public class Vertex {
    private Checker checker;
    final int vertexIndex;

    public Vertex(Checker checker, int vertexIndex){
        this.checker = checker;
        this.vertexIndex = vertexIndex;
    }
    public Checker getChecker(){
        return checker;
    }
    public void setChecker(Checker checker){
        this.checker = checker;
    }
}
