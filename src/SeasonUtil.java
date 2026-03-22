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
        if (seasonables == null || seasonables.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (Seasonable s : seasonables) {
            if (s != null) {
                sb.append(s.toString()).append("\n");
            }
        }

        // Using trim() to remove the last trailing newline
        return sb.toString().trim();
    }
}