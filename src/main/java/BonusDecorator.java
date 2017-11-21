public class BonusDecorator extends CartDecorator {
    public BonusDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship() {
        System.out.println("Bonus has been added!\n");
        return true;
    }
}
