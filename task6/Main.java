public class Main {
    public static void main(String[] args) {
            String[] car = new String[]{"Scania", "Man"};
            Saab saab1 = new Saab ("red","Ikarus","AX3456PC",2020, car);
            saab1.getModelDescription();
            Saab saab = new Saab("white", "Scania", "AX3456PI", 2019,45);
            saab.getModelDescription();
            Man man = new Man("red", "Man", "BI3456KM", 2010, 10.5F);
            man.getModelDescription();

    }
}
