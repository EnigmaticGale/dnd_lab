package Players;
import ENUMs.Weapons;
import Interfaces.IDamage;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class Knight extends Player implements IDamage {

    private Weapons weapon;

    public Knight(String name, int health, int gold,Weapons weapon ) {
        super(name, health, gold);
        this.weapon = weapon;
    }

    public void doDamage(IDamage target) {

        target.takeDamage(this.weapon.getDamage());
    }

    public void takeDamage(int damage){
        reduceHP(damage);
    }
}
