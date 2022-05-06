package Garage;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] car = new String[]{"Scania", "BMW", "Man"};
        Bus saab = new Bus("white", "Scania", "AX3456PI", 2019, 45);
        saab.getVoice();
        saab.setMove();
        saab.setBrake();
        saab.getModelDescription();
        Truck man = new Truck("red", "Man", "BI3456KM", 2010, 10.5F);
        man.getModelDescription();

    }
}
