public class Main {
    public static void main(String[] args) {
        String[] car = new String[]{"Scania", "BMW", "Man"};
        Saab saab = new Saab("white", "Scania", 2019);
        saab.setCars(car);
        saab.getModelDescription();
        Man man = new Man("black", "M123", "BI2387AI", 2018);
        man.setCars(car);
        man.getModelDescription();
        man.setColor("yellow");
        man.setModel("MX456");
        man.setNumber("BC8767MX");
        man.setBody(10.5F);
        man.setPurchaseData(2025);
        man.getModelDescription();
    }
}