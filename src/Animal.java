public abstract class Animal implements Seasonable,Comparable<Animal>{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Animal other) {
        // Returns 0 if equal, positive if this > other, negative if this < other
        if (other == null) return 1;
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public void changeSeason() {
        this.season = this.season.next();
    }


    @Override
    public String toString() {
        String effect = getSeasonalEffect();

        String details = String.format("weight=%d, season=%s, color=%s", weight, getCurrentSeason(), color);

        if (effect != null && !effect.isEmpty()) {
            return effect + ". " + details;
        }

        return details;
    }

    protected abstract String getSeasonalEffect();
}
