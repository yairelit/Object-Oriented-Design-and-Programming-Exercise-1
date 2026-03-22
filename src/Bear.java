public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        // Optional: Prepending the class name to the parent's string
        return "Bear: " + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (getCurrentSeason()) {
            case WINTER:
                this.weight -= (int)weight*0.2;
                break;
            case SPRING:
                this.weight -= (int)weight*0.25;
                break;
            case SUMMER:
                this.weight += (int)weight*0.33;
                break;
            case FALL:
                this.weight += (int)weight*0.25;
                break;
        }
    }
    @Override
    public String getSeasonalEffect(){
        switch(getCurrentSeason()){
            case WINTER:
                return "hibernating. sheds 20% of its weight";
            case SPRING:
                return "sheds 25% of its weight";
            case SUMMER:
                return "gains a third of its weight";
            case FALL:
                return "gains 25% of its weight";
            default:
                return "";
        }
    }

}
