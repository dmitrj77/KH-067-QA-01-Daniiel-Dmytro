package task7.src.Garage;

public  class Truck extends Car {

    public Truck(String color, String model, String number, int purchaseData,float body) {
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
    public  void getMove(){
        System.out.printf("\nTruck moves");

    }

    public void getBrake(){
        System.out.printf("\nTruck: brakes");

    }

    public  void getVoice(){
        System.out.printf("\nTruck : Boo-oo-o!");
    }
}
