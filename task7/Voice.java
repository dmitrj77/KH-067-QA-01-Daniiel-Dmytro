public interface Voice {
    void getVoice();

    void getEnythin();

    default void getCar() {
        for (int i = 0; i < Car.cars.length; i++) {
            Car.cars[i] = Car.cars[i];
            System.out.printf("\nCar: " + Car.cars[i]);
        }
    }


}
