import java.util.ArrayList;

public class ComputerGameParameters {
    private String name, description;
    private ArrayList<Genre> genres;
    private ArrayList<Platform> platforms;
    private double price;
    private int ageRestriction, gameId;

    public ComputerGameParameters(String name, String description, double price,
                                  int ageRestriction, ArrayList<Genre> genres,
                                  ArrayList<Platform> platforms, int gameId) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setAgeRestriction(ageRestriction);
        setGenre(genres);
        setPlatform(platforms);
        setGameId(gameId);
    }

    public boolean filter(ComputerGameParameters otherParameters) {
        if (!(this.getName().equals(otherParameters.getName()))
                || (this.getPrice() != otherParameters.getPrice())
                || (this.getAgeRestriction() != otherParameters.getAgeRestriction())
                || (!(this.getGenres().containsAll(otherParameters.getGenres()))
                && otherParameters.getGenres().containsAll(this.getGenres()))
                || (!(this.getPlatforms().containsAll(otherParameters.getPlatforms())
                && otherParameters.getPlatforms().containsAll(this.getPlatforms())))) {
            return false;
                }
        return true;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGenre(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public ArrayList<Genre> getGenres() {
        return this.genres;
    }

    public void setPlatform(ArrayList<Platform> platforms) {
        this.platforms = platforms;
    }

    public ArrayList<Platform> getPlatforms() {
        return this.platforms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public int getAgeRestriction() {
        return this.ageRestriction;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGameId() {
        return gameId;
    }

    @Override
    public String toString() {
        return "ComputerGameParameters{" +
                "name='" + this.getName() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", price=" + this.getPrice() +
                ", ageRestrinct=" + this.getAgeRestriction() +
                ", genres=" + this.getGenres() +
                ", platforms=" + this.getPlatforms() +
                ", gameId=" + this.getGameId() +
                '}';
    }
}