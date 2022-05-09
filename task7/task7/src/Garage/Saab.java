package task7.src.Garage;

public class Saab extends Bus {
    public Saab(String color, String model, String number, int purchaseData, int seat) {
        super(color, model, number, purchaseData, seat);
    }

    public Saab(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }

    @Override
    public void getModelDescription() {
        System.out.printf("\n-----Saab-----");
        super.getModelDescription();
        System.out.printf("\n Body : " + getSeat() + " ps");
    }


    public void getMove() {
        System.out.printf("Saab moves in city max speed"+ MAXIMUM_SPEED );
    }

    public void getBrake() {
        System.out.printf("Saab brakes");
    }

    @Override
    public void getVoice() {
        System.out.printf("Saab : Wow-wow-oo!");
    }


}

