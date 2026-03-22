public enum Season {
    WINTER, SPRING, SUMMER, FALL;
    // TODO: Add auxiliary functions.

    public Season next() {
        Season[] values = Season.values();
        int nextIndex = (this.ordinal() + 1) % values.length;
        return values[nextIndex];
    }
}
