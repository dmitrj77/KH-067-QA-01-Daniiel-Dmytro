public abstract class Bus extends Car {

    public Bus(String color, String model, String number, int purchaseData, int seat) {
        super(color, model, number, purchaseData, seat);
    }

    public Bus(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }
}

