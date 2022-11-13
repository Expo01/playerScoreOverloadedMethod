package com.company;

public class Main {

    public static void main(String[] args) {
        int playerOne = calculateScore("Bob", 50);
        int playerTwo = calculateScore(60);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        int finalScore = score * 1000;
        System.out.println(playerName + "final score of " + finalScore);
        return finalScore;
    }

    public static int calculateScore(int score){
        int finalScore = score * 1000;
        System.out.println("unnamed player had a final score of " + finalScore);
        return finalScore;
    }

    public static void calculateScore(){
        System.out.println("no player name or score data found");
    }

}
