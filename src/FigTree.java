

public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, Color.GREEN, (season == Season.SUMMER));
    }

    @Override
    public String toString() {
        return "Fig Tree: " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();

        if(getCurrentSeason() != Season.SUMMER)
            subFruit();

        switch (getCurrentSeason()){
            case WINTER:
                height += 0.2; // + 20 cm
                leavesColor = Color.NONE;
                break;
            case SPRING:
                height += 0.3; // + 30 cm
                leavesColor = Color.GREEN;
                break;
            case SUMMER:
                height += 0.3;
                addFruit();
                break;
            case FALL:
                height += 0.2;
                leavesColor = Color.YELLOW;
                break;
        }

    }

    @Override
    public String getSeasonalEffect() {
        switch (getCurrentSeason()){
            case WINTER:
                return "The height of the tree increases by 20 cm, and it loses its leaves";
            case SPRING:
                return "The height of the tree increases by 30 cm, and it grows green leaves";
            case SUMMER:
                return "The The height of the tree increases by 30 cm, and it bears fruit";
            case FALL:
                return "The height of the tree increases by 20 cm, and its leaves turn yellow";
            default:
                return "";

        }
    }
}
