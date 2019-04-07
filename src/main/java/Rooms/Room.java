package Rooms;

import Enemy.Goblin;
import Interfaces.IDamage;
import Players.Player;

import java.util.ArrayList;
import java.util.Random;

public abstract class Room {

    private ArrayList<Player> players;



    public Room () {
        this.players = new ArrayList<>();
    }

    public void addPlayer (Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

}
