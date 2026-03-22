public abstract class Tree implements Comparable<Tree>, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean hasFruit;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor, boolean hasFruit){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        this.hasFruit = hasFruit;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Tree other) {
        // Returns 0 if equal, positive if this > other, negative if this < other
        if (other == null) return 1;
        return Integer.compare(this.height, other.height);
    }

    @Override
    public void changeSeason() {
        this.season = this.season.next();
    }

    abstract String getSeasonalEffect();

    public void addFruit(){
        hasFruit = true;
    }

    public void subFruit(){
        hasFruit = false;
    }

    @Override
    public String toString() {
        String effect = getSeasonalEffect();

        String details = String.format("height=%d, season=%s, leaves color=%s", height, getCurrentSeason(), leavesColor);

        if (effect != null && !effect.isEmpty()) {
            return effect + ". " + details;
        }

        return details;
    }
}
