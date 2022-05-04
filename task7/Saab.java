public class Saab extends Bus {
    private int seat = 45;

    public Saab(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Saab(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }
    @Override
    public void getModelDescription() {
        System.out.printf("--Saab-Scania--");
        getModelDescription();
        System.out.printf("\n Seat : " + seat+" ps");
    }

    @Override
    public void setMove() {

    }

    @Override
    public void setBrake() {

    }

    @Override
    public void getVoice() {

    }

    @Override
    public void getEnythin() {

    }
}
