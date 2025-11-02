package prize;

public enum Prize {
    THREE(3,5000),
    FOUR(4,50000),
    FIVE(5,1500000),
    FIVE_BONUS(5,30000000),
    SIX(6,2000000000);

    private final int matchCount;
    private final int money;
    private final boolean bonusMatch;

    Prize(int matchCount, int money) {
        this(matchCount,money,false);
    }

    Prize(int matchCount, int money, boolean bonusMatch) {
        this.matchCount = matchCount;
        this.money = money;
        this.bonusMatch = bonusMatch;
    }

    public int getMatchCount() {
        return matchCount;
    }
    public int getMoney() {
        return money;
    }

}
