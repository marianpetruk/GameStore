public class ComputerGame {

    private ComputerGameParameters gameParameters;

    public ComputerGame(ComputerGameParameters parameters) {
        this.gameParameters = parameters;
    }

    public ComputerGame() {

    }

    public ComputerGameParameters getSpecifications() {
        return gameParameters;
    }

    @Override
    public String toString() {
        return "ComputerGame{" +
                "name='" + this.getSpecifications().getName() + '\'' +
                ", description='" + this.getSpecifications().getDescription() + '\'' +
                ", price=" + this.getSpecifications().getPrice() +
                ", ageRestrinct=" + this.getSpecifications().getAgeRestriction() +
                ", genres=" + this.getSpecifications().getGenres() +
                ", platforms=" + this.getSpecifications().getPlatforms() +
                '}';
    }
}
