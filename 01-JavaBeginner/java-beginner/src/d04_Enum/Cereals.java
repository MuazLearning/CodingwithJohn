package d04_Enum;

public enum Cereals {
    CAPATAIN_CRUNCH(50, 2.9),
    FROOT_LOOPS(60, 3.4),
    REESES_PUFFS(100, 3.8),
    COCOA_PUFFS(75, 3.6);

    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
