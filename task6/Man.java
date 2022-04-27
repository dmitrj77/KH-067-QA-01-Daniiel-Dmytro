public class Man extends Truck {
    private float body = 10.5F;

    public Man(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Man(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    @Override
    public void getModelDescription() {
        System.out.printf("\n-----Man-----");
        super.getModelDescription();
        System.out.printf("\n Body : " + body+" m3");
    }
}
