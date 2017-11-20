public class BonusDecorator extends CartDecorator {
    public BonusDecorator(Cart cart) {
        super(cart);
    }

//    @Override
//    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
//        cartToDecorate.setPaymentStrategy(paymentStrategy);
//    }
//    @Override
//    public void setDelieveryStrategy(DeliveryStrategy delieveryStrategy) {
//        cartToDecorate.setDelieveryStrategy(delieveryStrategy);
//    }
//
//    @Override
//    public double computeTotalPrice() {
//        return cartToDecorate.computeTotalPrice() * 0.9;
//    }

    @Override
    public boolean ship() {
        System.out.println("Bonus has been added!\n");
        return true;
//        cartToDecorate.addGame(new ComputerGame());
//        cartToDecorate.ship();
    }

//    @Override
//    public void addGame(ComputerGame game){
//        cartToDecorate.addGame(game);
//    }

}
