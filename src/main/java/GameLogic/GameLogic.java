package GameLogic;

import ENUMs.Weapons;
import Enemy.Goblin;
import Players.Knight;
import Players.Player;
import Rooms.BattleRoom;
import Rooms.Room;

public class GameLogic {

    private Room room;
    private Knight players;

    public GameLogic() {

    }

    public void createRoom() {
        Goblin goblin = new Goblin(10, Weapons.MACE);
        this.room = new BattleRoom(goblin);

    }

    public void addPlayerToRoom() {

}
