public abstract class Animal implements Seasonable,Comparable{
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
    public int compareTo(Object o) {
        if (!(o instanceof Animal)) {
            throw new IllegalArgumentException("Object is not an Animal");
        }

        Animal other = (Animal) o;

        // Returns 0 if equal, positive if this > other, negative if this < other
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public void changeSeason() {
        this.season = this.season.next();
    }


    @Override
    public String toString() {
        // We create the base string
        String result = String.format("weight=%d, season=%s, color=%s", weight, season, color);

        // We append the seasonal effect if it's not empty
        String effect = getSeasonalEffect();
        if (effect != null && !effect.isEmpty()) {
            result += ". " + effect;
        }

        return result;
    }

    protected abstract String getSeasonalEffect();
}
