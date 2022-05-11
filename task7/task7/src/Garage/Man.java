package task7.src.Garage;

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
        System.out.printf("\nBody : " + getBody() + " m3");
    }

    @Override
    public void getMove() {
        System.out.printf("\nMan moves in city max speed "+ MAXIMUM_SPEED_TRUCK);
    }

    @Override
    public void getBrake() {
        System.out.printf("\nMan brakes");
    }

    @Override
    public void getVoice() {
        System.out.printf("\nMan : Booo-oo!");
    }

}

