public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

//        cart = new DiscountCart(cart);

        cart.addGame(new ComputerGame());
        cart.addGame(new ComputerGame());
        cart.addGame(new ComputerGame());
        cart.addGame(new ComputerGame());
        cart.addGame(new ComputerGame());
        cart.addGame(new ComputerGame());

    }
}
