public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, (season == Season.WINTER) ? Color.WHITE : Color.BROWN);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        if (getCurrentSeason() == Season.WINTER) {
            this.color = Color.WHITE;
        } else if (getCurrentSeason() == Season.SPRING) {
            this.color = Color.BROWN;
        }
    }

    @Override
    public String getSeasonalEffect() {
        switch (getCurrentSeason()) {
            case WINTER: return "I am migrating south.";
            case SUMMER: return "I am migrating north.";
            default: return "";
        }
    }
}
