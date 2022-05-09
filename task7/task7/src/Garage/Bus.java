package task7.src.Garage;

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
    public void getMove(){
        System.out.printf("\nBus moves");
    }

    public void getBrake(){
        System.out.printf("\nBus: brakes");
    }

    public  void getVoice(){
        System.out.printf("\nBus : Wow-wow-oo!");
    }
}
