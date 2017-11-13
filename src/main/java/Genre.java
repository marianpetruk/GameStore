public enum Genre {
    ACTION("action"), MOBA("moba"), SIMULATION("simulation");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}