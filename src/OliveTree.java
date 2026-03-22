public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, Color.GREEN, (season == Season.FALL));
    }

    @Override
    public String toString() {
        return "Olive Tree: " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();

        if(getCurrentSeason() != Season.FALL)
            subFruit();

            switch (getCurrentSeason()){
                case WINTER:
                    height += 0.05;
                    break;
                case SPRING, SUMMER:
                    height += 0.1;
                    break;
                case FALL:
                    height += 0.05;
                    addFruit();
                    break;
            }
    }

    @Override
    public String getSeasonalEffect() {
        switch (getCurrentSeason()){
            case WINTER:
                return "The The height of the tree increases by 5 cm";
            case SPRING, SUMMER:
                return "The The height of the tree increases by 10 cm";
            case FALL:
                return "The The height of the tree increases by 5 cm, and it bears fruit";
            default:
                return "";
        }
    }
}
