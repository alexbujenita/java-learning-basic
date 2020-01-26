package com.javaGenericsTwo;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer kyle = new BaseballPlayer("Kyle");
        SoccerPlayer paul = new SoccerPlayer("Paul");

        Team bassano = new Team("BdG");
        bassano.addPlayer(joe);
        bassano.addPlayer(joe);
        bassano.addPlayer(kyle);
        bassano.addPlayer(paul);

        System.out.println(bassano.numPlayers());
    }
}
