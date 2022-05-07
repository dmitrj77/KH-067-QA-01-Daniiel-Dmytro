public class Main {
    public static void main(String[] args) {
        String[] cars = new String[]{"Scania", "BMW", "Man"};
        Bus saab = new Bus("white", "Scania", "AX3456PI", 2019, cars);
        saab.getCar();
        saab.getModelDescription();
        Bus saab1=new Bus("blue","");
        Truck man = new Truck("red", "Man", "BI3456KM", 2010, 10.5F);
        man.getModelDescription();
        man.getCar();

    }
}
