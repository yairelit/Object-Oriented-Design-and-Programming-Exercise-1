import java.lang.Math;

public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        // Optional: Prepending the class name to the parent's string
        return super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (getCurrentSeason()) {
            case WINTER:
                this.weight = (int) Math.round(this.weight * 0.8);
                break;
            case SPRING:
                this.weight = (int) Math.round(this.weight * 0.75);
                break;
            case SUMMER:
                this.weight = (int) Math.round(this.weight * 1.3333333333);
                break;
            case FALL:
                this.weight = (int) Math.round(this.weight * 1.25);
                break;
        }
    }
    @Override
    public String getSeasonalEffect() {
        return (getCurrentSeason() == Season.WINTER) ? "I am sleeping." : "";
    }

}
