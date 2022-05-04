import javax.swing.text.DefaultEditorKit;

public class Man extends Truck {
    private float body = 10.5F;

    public Man(String color, String model, int purchaseDate) {
        super(color, model, purchaseDate);
    }

    public Man(String color, String model, String number, int purchaseDate) {
        super(color, model, number, purchaseDate);
    }

    @Override
    public void getModelDescription() {
        System.out.printf("\n-----Man-----");
        getModelDescription();
        System.out.printf("\n Body : " + body+" m3");
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
