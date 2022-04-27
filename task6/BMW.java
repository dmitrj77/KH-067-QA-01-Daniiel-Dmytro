public class BMW extends Sedan {

    public BMW(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public BMW(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    @Override
    public void getModelDescription() {
        System.out.printf("\n-----BMW-----");
        super.getModelDescription();
        System.out.printf("\n Seat : " + seat+" ps");
    }
}
