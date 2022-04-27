public abstract class Truck extends Car {
    private float body = 10.5F;

    public Truck(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Truck(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    public void addCars(String[] car) {
        addCar(car);
    }

    public void getModelDescription() {
       super.getModelDescription();
    }
}
