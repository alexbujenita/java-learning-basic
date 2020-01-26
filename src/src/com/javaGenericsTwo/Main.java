package com.javaGenericsTwo;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer kyle = new BaseballPlayer("Kyle");
        SoccerPlayer paul = new SoccerPlayer("Paul");

        Team<FootballPlayer> bassano = new Team<>("BdG"); // adding the type argument, now this team will only accept FootballPlayer
        Team<FootballPlayer> mestre = new Team<>("Mestre");
        mestre.addPlayer(new FootballPlayer("Ignazio"));
        bassano.addPlayer(joe);
//        bassano.addPlayer(kyle);
//        bassano.addPlayer(paul);
        System.out.println(bassano.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Bats only");
        baseballTeam.addPlayer(kyle);
        System.out.println(baseballTeam.numPlayers());

        Team<SoccerPlayer> plot = new Team<>("PLOT");
        plot.addPlayer(paul);
        System.out.println(plot.numPlayers());

        bassano.matchResult(mestre, 30, 20);
//        bassano.matchResult(baseballTeam, 30, 30);
//        baseballTeam.matchResult(plot, 10, 20);
//        bassano.matchResult(plot, 100, 20);
//        plot.matchResult(baseballTeam, 30, 900);
        System.out.println(bassano.ranking());
    }
}
