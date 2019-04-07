package Rooms;

import Enemy.Goblin;

public class BattleRoom extends Room {

    private Goblin goblin;


    public BattleRoom(Goblin goblin) {

        this.goblin = goblin;
    }

    public Goblin getGoblin() {
        return goblin;
    }
}
