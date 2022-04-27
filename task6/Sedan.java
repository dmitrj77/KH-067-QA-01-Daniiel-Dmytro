public abstract class Sedan extends Car {
    public int seat = 4;

    public Sedan(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Sedan(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    public void addCars(String[] car) {
        addCar(car);
    }

    public void getModelDescription() {
        super.getModelDescription();
    }
}
