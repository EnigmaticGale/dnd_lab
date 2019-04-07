import ENUMs.Weapons;
import Rooms.BattleRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import Players.Knight;
import Enemy.Goblin;

public class BattleTest {

    private Knight knight;
    private Goblin goblin;
    private BattleRoom bRoom;

    @Before
    public void before () {
        knight = new Knight("Steven", 20, 30 , Weapons.SWORD);
        goblin = new Goblin(10, Weapons.MACE);
        bRoom = new BattleRoom(goblin);
    }

    @Test
    public void knightStrikesGoblin() {
        knight.doDamage(goblin);
        assertEquals(0,goblin.getHp());
    }

    @Test
    public void canAddPlayerstoRoom() {
        bRoom.addPlayer(knight);
        assertEquals(1, bRoom.getPlayers().size());
    }

}
