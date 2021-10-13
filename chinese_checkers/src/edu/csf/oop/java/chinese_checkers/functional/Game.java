package edu.csf.oop.java.chinese_checkers.functional;

import edu.csf.oop.java.chinese_checkers.Board;
import edu.csf.oop.java.chinese_checkers.functional.graphUtils.AdjMatrixGraph;
import edu.csf.oop.java.chinese_checkers.functional.graphUtils.Graph;
import edu.csf.oop.java.chinese_checkers.functional.graphUtils.Vertex;

import java.util.ArrayList;

public class Game {
    private gameStatus status;
    private int turn;
    final int players;
    private Board board;

    public Game(int players, Board board) {
        this.board = board;
        this.status = gameStatus.INACTIVE;
        this.turn = 0;
        this.players = players;
    }

    public Game(){
        players = 2;
        startNewGame(players);
    }

    public gameStatus getStatus(){
        return status;
    }

    public void setStatus(gameStatus status){
        this.status = status;
    }

    public int checkTurn(){
        return turn;
    }

    public void nextTurn(){
        if (turn < players) {
            turn++;
        }
        else {
            turn = 1;
        }
    }

    public void startNewGame(int players){
        if (players < 2 || players == 5 || players > 6){
            return;
        }
        Graph graph = new AdjMatrixGraph();
        ArrayList<Vertex> vertices = new ArrayList<>();
        for (int i = 0; i < 121; i++){
            vertices.add(new Vertex(null, i));

        }
        if (players == 2) {

        }
        if (players == 3){

        }
        if (players == 4){

        }
        if (players == 6){

        }
        board = new Board(graph);
        status = gameStatus.ACTIVE;
        nextTurn();
    }
}
