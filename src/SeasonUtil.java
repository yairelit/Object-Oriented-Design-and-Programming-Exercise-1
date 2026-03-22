import java.util.Arrays;

public class SeasonUtil {
    // Making the seasons array immutable as a list can be safer,
    // but keeping it as an array is fine if performance is the priority.
    public static final Season[] SEASONS = Season.values();

    public static void sortSeasonable(Comparable[] comparable) {
        if (comparable != null && comparable.length > 1) {
            Arrays.sort(comparable);
        }
    }

    public static String reportAll(Seasonable[] seasonables) {
        if (seasonables == null || seasonables.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seasonables.length; i++) {
            if (seasonables[i] != null) {
                String name = seasonables[i].getClass().getSimpleName();

                if (name.equals("OliveTree")) name = "Olive tree";
                if (name.equals("FigTree")) name = "Fig tree";


                String separator = (seasonables[i] instanceof Caribou) ? ":" : ".";

                sb.append(name).append(separator).append(" ").append(seasonables[i].toString());
                if (i < seasonables.length - 1) sb.append("\n");
            }
        }
        return sb.toString();
    }
}