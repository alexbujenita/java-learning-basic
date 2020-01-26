package com.javaGenericsTwo;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> { // to indicate that's going to have a type, and by extending we say the type of class to use for team, Player or any Player subclass
    // can also implement and extend, EG extends Player & Coach & Ref, coach and ref are interfaces in this case
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

//    private ArrayList<Player> members = new ArrayList<>(); // no need to specify the generic when using Java >8, we can use the diamond notation "<>"

    private ArrayList<T> members = new ArrayList<>();

    /*
    And how this basically works is when we
    actually instantiate a class the T will be
    replaced automatically by Java
    with the actual class we're using,
    with the real type in other words when
    we're actually instantiating the class.
    And that's why we've actually
    changed the addPlayer and
    the ArrayList as well, so
    all three changed so that we can actually,
    we're able to actually do
    that sort of type checking.
    */

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        /*
        And because this type's not known until
        we actually instantiate a class in other
        words at run time, there's actually no way
        for Java to know that an object of type
        T in this case really does
        have a get name method.

        So what we're going to do is we're gonna
        cast player the player parameterize type
        to make that a player type before
        attempting to evoke its getName method.
        System.out.println(((Player) player).getName() + " is already on this team.");
        TEMPORARY

        AFTER T extends Player we can remove the casting
         */
        if(members.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team -> " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
