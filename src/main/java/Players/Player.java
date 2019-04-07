package Players;

public abstract class  Player {

    private String name ;
    private int hp;
    private int gold;



    public Player(String name, int hp, int gold) {
        this.name = name;
        this.hp = hp;
        this.gold = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void reduceHP(int damage) {
        this.hp -= damage;
    }

}