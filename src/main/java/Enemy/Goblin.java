package Enemy;

import ENUMs.Weapons;
import Interfaces.IDamage;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class Goblin implements IDamage {

    private int hp;
    private Weapons weapon;



    public Goblin(int hp, Weapons weapon){
        this.hp = hp;
        this.weapon = weapon;

    }

    public void doDamage(IDamage target) {
        target.takeDamage(this.weapon.getDamage());
    }

    public void takeDamage(int damage) {
        reduceHealth(damage);
    }

    public void reduceHealth(int damage) {
        this.hp -= damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
