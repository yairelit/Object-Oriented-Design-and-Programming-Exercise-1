public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, Color.GREEN, (season == Season.FALL));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()) {
            case WINTER:
                this.height += 5;
                break;
            case FALL:
                this.height += 5;
                break;
            case SUMMER:
                this.height += 10;
                break;
            case SPRING:
                this.height += 10;
                break;
        }
    }

    @Override
    public String getSeasonalEffect() {
        return (getCurrentSeason() == Season.FALL) ? "I give fruit." : "";
    }
}
