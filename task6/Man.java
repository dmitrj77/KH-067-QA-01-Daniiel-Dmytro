public class Man extends Truck {
    public Man(String color, String model, String number, int purchaseData, float body) {
        super(color, model, number, purchaseData, body);
    }

    public Man(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }

    @Override
    public void getModelDescription() {
        System.out.printf("\n-----Man-----");
       super.getModelDescription();
        System.out.printf("\n Body : " + getBody() + " m3");
    }
}
