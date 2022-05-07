public  class Truck extends Car {

    public Truck(String color, String model, String number, int purchaseData, float body) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setBody(body);
    }

    public Truck(String color, String model, String number, int purchaseData, String[] cars) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setCars(cars);
    }
}