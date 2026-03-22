

public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, Color.GREEN, (season == Season.SUMMER));
        if (season == Season.FALL) {
            this.leavesColor = Color.YELLOW;
        }
    }

    @Override
    public String toString() {
        return  super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()) {
            case WINTER:
                this.height += 20;
                this.leavesColor = null;
                break;
            case SPRING:
                this.height += 30;
                this.leavesColor = Color.GREEN;
                break;
            case SUMMER:
                this.height += 30;
                this.leavesColor = Color.GREEN;
                break;
            case FALL:
                this.height += 20;
                this.leavesColor = Color.YELLOW; // חשוב: צהוב בסתיו
                break;
        }
    }

    @Override
    public String getSeasonalEffect() {
        return (getCurrentSeason() == Season.SUMMER) ? "I give fruit." : "";
    }
}
