import java.time.LocalDate;

public abstract class Car implements Move, Voice {
    private String color;
    private String model;
    private String number;
    private int purchaseData;
    private int seat;
    private float body;
    public static String[] cars = new String[8];

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public int getSeat() {
        return seat;
    }

    public float getBody() {
        return body;
    }

    public int getPurchaseData() {
        return purchaseData;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public void setNumber(String number) {
        this.number = number;

    }

    public void setSeat(int seat) {
        if (seat > 0) {
            this.seat = seat;
        } else System.out.printf("\nSeat will to be not less 0. You set: " + seat);
    }

    public void setBody(float body) {
        if (body > 0) {
            this.body = body;
        } else System.out.printf("\nVolume of Body cannot to be less that 0. You set: " + body);
    }

    public void setPurchaseData(int purchaseData) {
        int date = LocalDate.now().getYear();
        if (purchaseData < date) {
            this.purchaseData = purchaseData;
        } else System.out.printf("\nPurchaseData cannot to be more that now.You set: " + purchaseData);
    }

    public Car(String color, String model, int purchaseData) {
        setColor(color);
        setModel(model);
        setPurchaseData(purchaseData);
    }

    public Car(String color, String model, String number, int purchaseData) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
    }

    public void setCars(String[] car) {

        // for (int i = 0; i < cars.length; i++) {
        if (cars[0] == (null)) {
            cars[0] = car[0];
            // } else break;
            // }
        }

        // public void getCar() {
        //  for (int i = 0; i < cars.length; i++) {
        //     cars[i] = cars[i];
        //System.out.printf("\nCar: " + cars[i]);
        //}
        // }

       // public void getModelDescription() {
        //   String model = getModel();
        ///  int purchaseData = getPurchaseData();String color = getColor();
         ///String number = getNumber();
         // System.out.printf("\n Model: " + model + "\n Color: " + color +
         //        "\n Number: " + number + "\n PurchaseData:" + purchaseData);
       // }
    }
}
