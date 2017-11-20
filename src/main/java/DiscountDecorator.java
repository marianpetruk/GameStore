public class DiscountDecorator extends CartDecorator {

    private double discount = 0.5;

    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double blackFridayDiscount) {
        discount = blackFridayDiscount;
    }

    @Override
    public double computeTotalPrice() {
        System.out.println("Discount has been applied!");
        return super.computeTotalPrice() * discount;
    }


}
