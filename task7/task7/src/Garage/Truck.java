package task7.src.Garage;

public abstract class Truck extends Car {

    public Truck(String color, String model, String number, int purchaseData, float body) {
        super(color, model, number, purchaseData, body);
    }

    public Truck(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }

    public abstract void getMove();

    public abstract void getBrake();

    public abstract void getVoice();
}
