package task7.src.Garage;

public abstract class Truck extends Car {

    public Truck(String color, String model, String number, int purchaseData, float body) {
        super(color, model, number, purchaseData, body);
    }

    public Truck(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }

    public void getMove() {
        System.out.printf("\nTruck moves");

    }

    public void getBrake() {
        System.out.printf("\nTruck: brakes");

    }

    public void getVoice() {
        System.out.printf("\nTruck: Boo-oo-o!");
    }
}
