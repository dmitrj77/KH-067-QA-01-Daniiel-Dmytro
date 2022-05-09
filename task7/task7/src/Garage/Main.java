package task7.src.Garage;

public class Main {
    public static void main(String[] args) {
        String[] car = new String[]{"Scania", "BMW", "Man"};
       Saab saab = new Saab("white", "Scania", "AX3456PI", 2019,45);
        saab.getVoice();
        saab.getMove();
        saab.getBrake();
        saab.getSawFly();
        saab.getModelDescription();
        Man man = new Man("red", "Man", "BI3456KM", 2010, 10.5F);
        man.getVoice();
        man.getMove();
        man.getBrake();
        man.getSawFly();
        man.getModelDescription();

    }
}
