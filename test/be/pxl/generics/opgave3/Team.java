package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Team<T extends Player> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private Set<Player> spelers = new HashSet<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        spelers.add(player);
    }

    public int numberOfPlayers() {
        return spelers.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
            opponent.lost++;
        } else {
            if (ourScore < theirScore) {
                lost++;
                opponent.won++;
            } else {
                this.tied++;
                opponent.tied++;
            }
        }
        opponent.played++;
        played++;
    }

    public int ranking() {
        return won * 3 + tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }
    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public Set<Player> getSpelers() {
        return spelers;
    }
}