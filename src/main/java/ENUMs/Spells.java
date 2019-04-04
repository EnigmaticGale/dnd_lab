package ENUMs;

public enum Spells {

    FIREBALL(20),
    ICEBLAST(20),
    MAGICMISSILE(30);

    private final int damage;

    Spells(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
