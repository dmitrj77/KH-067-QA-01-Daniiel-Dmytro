public abstract class Bus extends Car {
    //private int seat = 45;

    public Bus(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Bus(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    public void setCars(String[] car) {
        super.setCars(car);
    }

    public void getModelDescription() {
        super.getModelDescription();
    }
}

