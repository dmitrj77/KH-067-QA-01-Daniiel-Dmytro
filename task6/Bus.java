public  class Bus extends Car {

    public Bus(String color, String model, String number, int purchaseData,int seat) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setSeat(seat);
    }
    public Bus(String color, String model, String number, int purchaseData, String[] cars) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setCars(cars);
    }
}

