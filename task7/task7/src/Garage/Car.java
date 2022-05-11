package task7.src.Garage;

import java.time.LocalDate;

public abstract class Car implements Voice,Move {
    private String color;
    private String model;
    private String number;
    private int purchaseData;
    private int seat;
    private float body;
    private String[] cars = new String[]{};

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
        if (purchaseData > date) {
            throw new RuntimeException("\nPurchaseData cannot to be more that now.You set: " + purchaseData);
        }
        this.purchaseData = purchaseData;
    }


    public void setCars(String[] car) {
        if (cars.length == 0) {
            cars = car;
        } else {
            System.out.printf("Array not empty");
        }
    }

    public Car(String color, String model, String number, int purchaseData, String[] cars) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setCars(cars);
    }
    public Car(String color, String model, String number, int purchaseData,float body) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setBody(body);
    }
    public Car(String color, String model, String number, int purchaseData,int seat) {
        setColor(color);
        setModel(model);
        setNumber(number);
        setPurchaseData(purchaseData);
        setSeat(seat);
    }

   public void getModelDescription() {
       System.out.printf("\nModel:"+getModel()+"\ncolor:"+ getColor()+
               "\nnumber "+ getNumber()+ "\nPurchase:" +getPurchaseData());
    }
    public abstract void getVoice();
    public abstract void getMove();

   public abstract void getBrake();

}

