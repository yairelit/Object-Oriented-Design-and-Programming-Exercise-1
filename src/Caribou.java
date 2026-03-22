public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        super(weight, season, (season == Season.WINTER) ? Color.WHITE : Color.BROWN);
    }

    @Override
    public String toString() {
        return "Caribou: " + super.toString();
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
            case WINTER:
                return "changes its color to white and migrates south.";
            case SPRING:
                return "changes its color to brown";
            case SUMMER:
                return "migrates north";
            case FALL:
                return "No change";
            default:
                return "";
        }
    }
}
