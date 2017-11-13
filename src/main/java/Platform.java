public enum Platform {
    Linux("GNU/Linux"), Windows("Windows"), MAC("MacOS"), ANDROID("Android"), IPHONE("IOS");

    private String name;

    Platform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}