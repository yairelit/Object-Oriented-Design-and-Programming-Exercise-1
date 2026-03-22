public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Tree)) {
            throw new IllegalArgumentException("Object is not a Tree");
        }

        Tree other = (Tree) o;

        // Returns 0 if equal, positive if this > other, negative if this < other
        return Integer.compare(this.height, other.height);
    }

    @Override
    public void changeSeason() {
        this.season = this.season.next();
    }

    @Override
    public String toString() {
        return String.format("height=%d, season=%s, leavesColor=%s", height, season, leavesColor);
    }
}
