public enum HealingItems {

    POTION(30),
    HERBS(10),
    LAYONHANDS(40);

    private final int health;

    HealingItems(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


}
