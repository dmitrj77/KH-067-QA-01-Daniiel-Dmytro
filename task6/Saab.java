public class Saab extends Bus {
    public Saab(String color, String model, String number, int purchaseData, int seat) {
        super(color, model, number, purchaseData, seat);
    }

    public Saab(String color, String model, String number, int purchaseData, String[] cars) {
        super(color, model, number, purchaseData, cars);
    }

     public void getModelDescription() {
        System.out.printf("--Saab-Scania--");
        super.getModelDescription();
        System.out.printf("\n Seat : " + getSeat()+" ps");
    }
}