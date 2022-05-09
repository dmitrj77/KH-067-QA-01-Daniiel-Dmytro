package task7.src.Garage;

public abstract class Bus extends Car {

    public Bus(String color, String model, String number, int purchaseData,int seat) {
        super(color, model, number, purchaseData, seat);
    }
    public Bus(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
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
